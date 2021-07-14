package com.stepdefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.When;

public class GovernancePageStepdef extends BaseClass {

	@When("^Click on Learn More from the bottom of the page$")
	public void click_on_Learn_More_from_the_bottom_of_the_page() throws Throwable {
		governancePage.clickOnLearnMore();
	}

}
