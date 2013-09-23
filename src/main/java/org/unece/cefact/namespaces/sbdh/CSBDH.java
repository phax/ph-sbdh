/**
 * Copyright (C) 2013 Philip Helger
 * ph[at]phloc[dot]com
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
package org.unece.cefact.namespaces.sbdh;

import java.util.List;

import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.io.IReadableResource;
import com.phloc.commons.io.resource.ClassPathResource;

/**
 * Contains all the constants for SBDH handling.
 * 
 * @author Philip Helger
 */
@Immutable
public final class CSBDH
{
  /**
   * XML Schema resources for SBDH 1.3 - sine include is used, the other schemas
   * must not be specified.
   */
  public static final List <? extends IReadableResource> SBDH_XSDS = ContainerHelper.newUnmodifiableList (new ClassPathResource ("/schemas/sbdh/StandardBusinessDocumentHeader.xsd"));

  /** Namespace URI for SBDH 1.3 */
  public static final String SBDH_NS = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader";

  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final CSBDH s_aInstance = new CSBDH ();

  private CSBDH ()
  {}
}
