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
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.xml.validation.Schema;

import com.helger.commons.annotation.PresentForCodeCoverage;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.ArrayHelper;
import com.helger.commons.collection.impl.CommonsHashMap;
import com.helger.commons.collection.impl.ICommonsMap;
import com.helger.commons.collection.impl.ICommonsSet;

/**
 * SBDH document type map. Provides sanity methods for accessing SBDH document
 * types based on different information items.
 *
 * @author Philip Helger
 */
@Immutable
public final class SBDHDocumentTypes
{
  /** Maps local names to document types */
  private static final ICommonsMap <String, ESBDHDocumentType> s_aLocalName2DocType = new CommonsHashMap <> ();

  static
  {
    // Register all SBDH document types
    for (final ESBDHDocumentType eDocType : ESBDHDocumentType.values ())
    {
      // add to local name map
      final String sLocalName = eDocType.getLocalName ();
      if (s_aLocalName2DocType.containsKey (sLocalName))
        throw new IllegalArgumentException ("The local name '" + sLocalName + "' is already mapped!");
      s_aLocalName2DocType.put (sLocalName, eDocType);
    }
  }

  @PresentForCodeCoverage
  private static final SBDHDocumentTypes s_aInstance = new SBDHDocumentTypes ();

  private SBDHDocumentTypes ()
  {}

  /**
   * @return A non-<code>null</code> set of all supported SBDH document element
   *         local names.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsSet <String> getAllLocalNames ()
  {
    return s_aLocalName2DocType.copyOfKeySet ();
  }

  /**
   * Get the document type matching the passed document element local name.
   *
   * @param sLocalName
   *        The document element local name of any SBDH document type. May be
   *        <code>null</code>.
   * @return <code>null</code> if no SBDH document type matching the specified
   *         local name exists.
   */
  @Nullable
  public static ESBDHDocumentType getDocumentTypeOfLocalName (@Nullable final String sLocalName)
  {
    return s_aLocalName2DocType.get (sLocalName);
  }

  /**
   * Get the domain object class of the passed document element local name.
   *
   * @param sLocalName
   *        The document element local name of any SBDH document type. May be
   *        <code>null</code>.
   * @return <code>null</code> if no such implementation class exists.
   */
  @Nullable
  public static Class <?> getImplementationClassOfLocalName (@Nullable final String sLocalName)
  {
    final ESBDHDocumentType eDocType = getDocumentTypeOfLocalName (sLocalName);
    return eDocType == null ? null : eDocType.getImplementationClass ();
  }

  /**
   * Get the SBDH document type matching the passed implementation class.
   *
   * @param aImplClass
   *        The implementation class to use. May be <code>null</code>.
   * @return <code>null</code> if the implementation class is <code>null</code>
   *         or if no SBDH document type has the specified implementation class.
   */
  @Nullable
  public static ESBDHDocumentType getDocumentTypeOfImplementationClass (@Nullable final Class <?> aImplClass)
  {
    if (aImplClass == null)
      return null;
    return ArrayHelper.findFirst (ESBDHDocumentType.values (),
                                  eDocType -> eDocType.getImplementationClass ().equals (aImplClass));
  }

  /**
   * Get the XSD Schema object for the SBDH document type of the passed document
   * element local name.
   *
   * @param sLocalName
   *        The document element local name of any SBDH document type. May be
   *        <code>null</code>.
   * @return <code>null</code> if no such SBDH document type exists.
   */
  @Nullable
  public static Schema getSchemaOfLocalName (@Nullable final String sLocalName)
  {
    final ESBDHDocumentType eDocType = getDocumentTypeOfLocalName (sLocalName);
    return eDocType == null ? null : eDocType.getSchema ();
  }

  /**
   * Get the XSD Schema object for the SBDH document type of the passed
   * implementation class.
   *
   * @param aImplClass
   *        The implementation class of any SBDH document type. May be
   *        <code>null</code>.
   * @return <code>null</code> if no such SBDH document type exists.
   */
  @Nullable
  public static Schema getSchemaOfImplementationClass (@Nullable final Class <?> aImplClass)
  {
    final ESBDHDocumentType eDocType = getDocumentTypeOfImplementationClass (aImplClass);
    return eDocType == null ? null : eDocType.getSchema ();
  }
}
