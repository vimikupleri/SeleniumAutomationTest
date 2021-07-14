package com.stepdefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class SponsorPageStepdef extends BaseClass {

	@Then("^it should navigate Sponsers page$")
	public void it_should_navigate_Sponsers_page() throws Throwable {
		sponsorPage.verifySponsorPage();
	}

}
