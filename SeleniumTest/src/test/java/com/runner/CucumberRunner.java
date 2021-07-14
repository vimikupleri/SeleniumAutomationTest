package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.stepdefinition" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json" }, tags = "@test")

public class CucumberRunner {

}
