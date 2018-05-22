package com.company.project_name.qa;

import org.junit.jupiter.api.BeforeEach;

import com.company.qa.SeleniumTest;
import com.company.qa.utilities.XMLUtilities;

abstract class CompanyProjectTest extends SeleniumTest {

  protected static long timeout = 20L;

  @BeforeEach
  void setUp() throws Exception {
    ext.navigateTo(XMLUtilities.getItemFromNode("baseUrl"));
  }
}