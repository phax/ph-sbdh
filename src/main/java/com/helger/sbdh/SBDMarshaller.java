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
package com.helger.sbdh;

import org.unece.cefact.namespaces.sbdh.ObjectFactory;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocument;

import com.helger.jaxb.AbstractJAXBMarshaller;

/**
 * This is the reader and writer for SBD 1.3 documents. This class may be
 * derived to override protected methods from {@link AbstractJAXBMarshaller}.
 *
 * @author Philip Helger
 */
public class SBDMarshaller extends AbstractJAXBMarshaller <StandardBusinessDocument>
{
  private final MapBasedNamespaceContext m_aNSContext;
  public SBDMarshaller ()
  {
    super (StandardBusinessDocument.class,
           CSBDH.SBDH_XSDS,
           o -> new ObjectFactory ().createStandardBusinessDocument (o));
    m_aNSContext = new MapBasedNamespaceContext();
    m_aNSContext.addMapping("sh", CSBDH.SBDH_NS);
  }
  
  @Override
  protected void customizeMarshaller(final Marshaller aMarshaller) {
    try {
            JAXBMarshallerHelper.setSunNamespacePrefixMapper(aMarshaller, m_aNSContext);
        } catch (final Throwable t) {
            // Ignore
        }
    }
}
