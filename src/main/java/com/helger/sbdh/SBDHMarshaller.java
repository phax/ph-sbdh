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
package com.helger.sbdh;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import org.unece.cefact.namespaces.sbdh.ObjectFactory;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocumentHeader;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.jaxb.GenericJAXBMarshaller;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * This is the reader and writer for SBDH 1.3 documents. This class may be
 * derived to override protected methods from {@link GenericJAXBMarshaller}.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class SBDHMarshaller extends GenericJAXBMarshaller <StandardBusinessDocumentHeader>
{
  @Nonnull
  @ReturnsMutableCopy
  public static MapBasedNamespaceContext createDefaultNamespaceContext ()
  {
    final MapBasedNamespaceContext aNSContext = new MapBasedNamespaceContext ();
    aNSContext.addMapping ("sh", CSBDH.SBDH_NS);
    return aNSContext;
  }

  public SBDHMarshaller ()
  {
    this (true);
  }

  public SBDHMarshaller (final boolean bValidationEnabled)
  {
    super (StandardBusinessDocumentHeader.class,
           bValidationEnabled ? CSBDH.SBDH_XSDS : null,
           o -> new ObjectFactory ().createStandardBusinessDocumentHeader (o));

    setNamespaceContext (createDefaultNamespaceContext ());
  }
}
