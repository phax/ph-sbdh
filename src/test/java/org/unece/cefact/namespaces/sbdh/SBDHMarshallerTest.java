package org.unece.cefact.namespaces.sbdh;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import com.phloc.commons.io.file.iterate.FileSystemIterator;

/**
 * Test class for class {@link SBDMarshaller}.
 * 
 * @author Philip Helger
 */
public final class SBDHMarshallerTest
{
  @Test
  public void testReadAll ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/examples/sbd"))
      if (aFile.isFile ())
        assertNotNull (aFile.getAbsolutePath (), new SBDMarshaller ().read (aFile));
  }
}
