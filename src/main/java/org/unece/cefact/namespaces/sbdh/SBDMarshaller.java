/**
 * Copyright (C) 2006-2013 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
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

import com.phloc.commons.io.IReadableResource;
import com.phloc.commons.jaxb.utils.AbstractJAXBMarshaller;

/**
 * This is the reader and writer for SBDH 1.3 documents. This class may be
 * derived to override protected methods from {@link AbstractJAXBMarshaller}.
 * 
 * @author Philip Helger
 */
public class SBDMarshaller extends AbstractJAXBMarshaller <StandardBusinessDocument>
{
  public SBDMarshaller ()
  {
    super (StandardBusinessDocument.class, true ? (List <? extends IReadableResource>) null : CSBDH.SBDH_XSDS);
  }

  @Override
  @Nonnull
  protected final JAXBElement <StandardBusinessDocument> wrapObject (final StandardBusinessDocument aInvoice)
  {
    return new ObjectFactory ().createStandardBusinessDocument (aInvoice);
  }
}
