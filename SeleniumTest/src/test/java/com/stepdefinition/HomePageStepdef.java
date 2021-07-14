package com.stepdefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepdef extends BaseClass {

	@Given("^user launch \"([^\"]*)\" browser$")
	public void user_launch_browser(String arg1) throws Throwable {
		homePage.setupDriver(arg1);
	}

	@When("^user enter URL https://www\\.selenium\\.dev/$")
	public void user_enter_URL_https_www_selenium_dev() throws Throwable {
		homePage.verifyHomepage();
	}

	@When("^Click on  download button from header of the page$")
	public void click_on_download_button_from_header_of_the_page() throws Throwable {
		homePage.clickonDownlodbutton();
	}

	@Then("^It should navigate to the downlod page$")
	public void it_should_navigate_to_the_downlod_page() throws Throwable {
		homePage.verifyDownloadPage();
	}

	@When("^User click on the about section in the top header$")
	public void user_click_on_the_about_section_in_the_top_header() throws Throwable {
		homePage.clickOnAboutSection();
	}

	@When("^Select Governance from the section and verify the navigation is successful$")
	public void select_Governance_from_the_section_and_verify_the_navigation_is_successful() throws Throwable {
		homePage.verifyGovernancepage();
	}

	@When("^User click on Documentation$")
	public void user_click_on_Documentation() throws Throwable {
		homePage.clickDocumentation();

	}

}
