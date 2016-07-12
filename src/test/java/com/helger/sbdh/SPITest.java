/**
 * Copyright (C) 2006-2016 BRZ GmbH
 * http://www.brz.gv.at
 *
 * All rights reserved
 */
package com.helger.sbdh;

import org.junit.Test;

import com.helger.commons.mock.SPITestHelper;

public final class SPITest
{
  @Test
  public void testBasic () throws Exception
  {
    SPITestHelper.testIfAllSPIImplementationsAreValid ();
  }
}
