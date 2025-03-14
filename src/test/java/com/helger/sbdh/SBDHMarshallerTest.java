/*
 * Copyright (C) 2014-2025 Philip Helger (www.helger.com)
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
package com.helger.sbdh;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.io.file.FileSystemIterator;

/**
 * Test class for class {@link SBDMarshaller}.
 *
 * @author Philip Helger
 */
public final class SBDHMarshallerTest
{
  private static final Logger LOGGER = LoggerFactory.getLogger (SBDHMarshallerTest.class);

  @Test
  public void testReadAll ()
  {
    for (final File aFile : new FileSystemIterator ("src/test/resources/external/examples/sbd"))
      if (aFile.isFile ())
      {
        LOGGER.info ("Reading " + aFile.getName ());
        assertNotNull (aFile.getAbsolutePath (), new SBDMarshaller ().read (aFile));
      }
  }
}
