/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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

import com.helger.commons.annotation.PresentForCodeCoverage;

/**
 * Validate all SBDH document types.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public final class SBDHValidator
{
  @PresentForCodeCoverage
  private static final SBDHValidator s_aInstance = new SBDHValidator ();

  private SBDHValidator ()
  {}

  /**
   * Create a validation builder for StandardBusinessDocument.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHValidatorBuilder <StandardBusinessDocument> standardBusinessDocument ()
  {
    return SBDHValidatorBuilder.create (StandardBusinessDocument.class);
  }

  /**
   * Create a validation builder for StandardBusinessDocumentHeader.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static SBDHValidatorBuilder <StandardBusinessDocumentHeader> standardBusinessDocumentHeader ()
  {
    return SBDHValidatorBuilder.create (StandardBusinessDocumentHeader.class);
  }
}
