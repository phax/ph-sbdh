/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
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
package org.unece.cefact.namespaces.sbdh;

import java.util.List;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBElement;

import com.helger.commons.io.resource.IReadableResource;
import com.helger.jaxb.AbstractJAXBMarshaller;

/**
 * This is the reader and writer for SBDH 1.3 documents. This class may be
 * derived to override protected methods from {@link AbstractJAXBMarshaller}.
 * 
 * @author Philip Helger
 */
public class SBDHMarshaller extends AbstractJAXBMarshaller <StandardBusinessDocumentHeader>
{
  public SBDHMarshaller ()
  {
    super (StandardBusinessDocumentHeader.class, false ? (List <? extends IReadableResource>) null : CSBDH.SBDH_XSDS);
  }

  @Override
  @Nonnull
  protected final JAXBElement <StandardBusinessDocumentHeader> wrapObject (final StandardBusinessDocumentHeader aInvoice)
  {
    return new ObjectFactory ().createStandardBusinessDocumentHeader (aInvoice);
  }
}
