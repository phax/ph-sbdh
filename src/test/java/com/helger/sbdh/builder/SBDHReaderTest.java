/*
 * Copyright (C) 2014-2023 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.sbdh.builder;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocument;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocumentHeader;

import com.helger.commons.io.file.FileSystemIterator;
import com.helger.commons.mock.CommonsTestHelper;

/**
 * Test class for class {@link SBDHReader}.
 *
 * @author Philip Helger
 */
@Deprecated (forRemoval = true, since = "5.0.1")
public final class SBDHReaderTest
{
  @Test
  public void testSBD ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/external/examples/sbd"))
      if (aFile.isFile ())
      {
        final StandardBusinessDocument aDoc = SBDHReader.standardBusinessDocument ().read (aFile);
        assertNotNull (aFile.getAbsolutePath (), aDoc);
        final String sDoc = SBDHWriter.standardBusinessDocument ().getAsString (aDoc);
        assertNotNull (aFile.getAbsolutePath (), sDoc);
        final StandardBusinessDocument aDoc2 = SBDHReader.standardBusinessDocument ().read (sDoc);
        assertNotNull (aFile.getAbsolutePath (), aDoc2);

        CommonsTestHelper.testEqualsImplementationWithEqualContentObject (aDoc, aDoc2);
        CommonsTestHelper.testEqualsImplementationWithEqualContentObject (aDoc, aDoc.clone ());
      }
  }

  @Test
  public void testSBDH ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/external/examples/sbdh"))
      if (aFile.isFile ())
      {
        final StandardBusinessDocumentHeader aDoc = SBDHReader.standardBusinessDocumentHeader ().read (aFile);
        assertNotNull (aFile.getAbsolutePath (), aDoc);
        final String sDoc = SBDHWriter.standardBusinessDocumentHeader ().getAsString (aDoc);
        assertNotNull (aFile.getAbsolutePath (), sDoc);
        final StandardBusinessDocumentHeader aDoc2 = SBDHReader.standardBusinessDocumentHeader ().read (sDoc);
        assertNotNull (aFile.getAbsolutePath (), aDoc2);

        CommonsTestHelper.testEqualsImplementationWithEqualContentObject (aDoc, aDoc2);
        CommonsTestHelper.testEqualsImplementationWithEqualContentObject (aDoc, aDoc.clone ());
      }
  }
}
