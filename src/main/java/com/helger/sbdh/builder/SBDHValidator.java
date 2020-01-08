/**
 * Copyright (C) 2014-2020 Philip Helger (www.helger.com)
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

import com.helger.jaxb.builder.JAXBValidationBuilder;

/**
 * Validate all SBDH document types.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The SBDH implementation class to be validated
 */
@NotThreadSafe
public class SBDHValidator <JAXBTYPE> extends JAXBValidationBuilder <JAXBTYPE, SBDHValidator <JAXBTYPE>>
{
  public SBDHValidator (@Nonnull final Class <JAXBTYPE> aClass)
  {
    this (SBDHDocumentTypes.getDocumentTypeOfImplementationClass (aClass));
  }

  public SBDHValidator (@Nonnull final ESBDHDocumentType eDocType)
  {
    super (eDocType);
  }

  /**
   * Create a validation builder for StandardBusinessDocument.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHValidator <StandardBusinessDocument> standardBusinessDocument ()
  {
    return new SBDHValidator <> (StandardBusinessDocument.class);
  }

  /**
   * Create a validation builder for StandardBusinessDocumentHeader.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHValidator <StandardBusinessDocumentHeader> standardBusinessDocumentHeader ()
  {
    return new SBDHValidator <> (StandardBusinessDocumentHeader.class);
  }
}
