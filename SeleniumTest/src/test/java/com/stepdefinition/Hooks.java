package com.stepdefinition;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void BeforeSteps() {

	}

	@After
	public void AfterSteps() {
		driver.close();
	}

}
