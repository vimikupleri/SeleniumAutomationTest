package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.DocumentationPage;
import com.pages.GovernancePage;
import com.pages.HomePage;
import com.pages.SponsorPage;

public class BaseClass {
	public static WebDriver driver;

	public static HomePage homePage = new HomePage();
	public static GovernancePage governancePage = new GovernancePage();
	public static SponsorPage sponsorPage = new SponsorPage();
	public static DocumentationPage documentationPage = new DocumentationPage();
}
