/**
 * Copyright (C) 2014-2019 Philip Helger (www.helger.com)
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

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import org.unece.cefact.namespaces.sbdh.StandardBusinessDocument;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocumentHeader;

import com.helger.jaxb.builder.JAXBReaderBuilder;

/**
 * Read all SBDH document types.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The SBDH implementation class to be read
 */
@NotThreadSafe
public class SBDHReader <JAXBTYPE> extends JAXBReaderBuilder <JAXBTYPE, SBDHReader <JAXBTYPE>>
{
  public SBDHReader (@Nonnull final Class <JAXBTYPE> aClass)
  {
    this (SBDHDocumentTypes.getDocumentTypeOfImplementationClass (aClass), aClass);
  }

  public SBDHReader (@Nonnull final ESBDHDocumentType eDocType, @Nonnull final Class <JAXBTYPE> aImplClass)
  {
    super (eDocType, aImplClass);
  }

  /**
   * Create a reader builder for StandardBusinessDocument.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHReader <StandardBusinessDocument> standardBusinessDocument ()
  {
    return new SBDHReader <> (StandardBusinessDocument.class);
  }

  /**
   * Create a reader builder for StandardBusinessDocumentHeader.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHReader <StandardBusinessDocumentHeader> standardBusinessDocumentHeader ()
  {
    return new SBDHReader <> (StandardBusinessDocumentHeader.class);
  }
}
