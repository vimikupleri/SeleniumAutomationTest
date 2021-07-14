package com.stepdefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DocumentationStepdef extends BaseClass {
	@When("^User is in documentation page$")
	public void user_is_in_documentation_page() throws Throwable {
		documentationPage.verifyDocumentationPage();
	}

	@When("^User search \"([^\"]*)\" in the search panel$")
	public void user_search_in_the_search_panel(String searchWord) throws Throwable {
		documentationPage.enterSearchBox(searchWord);
	}

	@When("^Select the second search result$")
	public void select_the_second_search_result() throws Throwable {
		documentationPage.selectSearchresult();
	}

	@Then("^It should navigate to selected page$")
	public void it_should_navigate_to_selected_page() throws Throwable {
		documentationPage.verifyGrid3DocumentationPage();
	}

}
