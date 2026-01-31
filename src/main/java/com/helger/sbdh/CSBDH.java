/*
 * Copyright (C) 2014-2026 Philip Helger (www.helger.com)
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

import java.util.List;

import org.jspecify.annotations.NonNull;

import com.helger.annotation.concurrent.Immutable;
import com.helger.annotation.style.CodingStyleguideUnaware;
import com.helger.annotation.style.PresentForCodeCoverage;
import com.helger.collection.commons.CommonsArrayList;
import com.helger.io.resource.ClassPathResource;

/**
 * Contains all the constants for SBDH handling.
 *
 * @author Philip Helger
 */
@Immutable
public final class CSBDH
{
  @NonNull
  private static ClassLoader _getCL ()
  {
    return CSBDH.class.getClassLoader ();
  }

  /**
   * XML Schema resources for SBDH 1.3 - since include is used, the other
   * schemas must not be specified.
   */
  public static final String SBDH_XSD_PATH = "/external/schemas/sbdh/StandardBusinessDocumentHeader.xsd";

  /**
   * XML Schema resources for SBDH 1.3 - since include is used, the other
   * schemas must not be specified.
   */
  @CodingStyleguideUnaware
  public static final List <ClassPathResource> SBDH_XSDS = new CommonsArrayList <> (new ClassPathResource (SBDH_XSD_PATH,
                                                                                                           _getCL ())).getAsUnmodifiable ();

  /** Namespace URI for SBDH 1.3 */
  public static final String SBDH_NS = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader";

  @PresentForCodeCoverage
  private static final CSBDH INSTANCE = new CSBDH ();

  private CSBDH ()
  {}
}
