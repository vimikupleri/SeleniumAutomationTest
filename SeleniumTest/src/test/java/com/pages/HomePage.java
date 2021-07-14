package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

import Utils.Driver;

public class HomePage extends BaseClass {

	public void setupDriver(String browserType) {
		driver = Driver.getDriver(browserType);
	}

	public void verifyHomepage() {
		driver.get("https://www.selenium.dev/");
		Assert.assertEquals("SeleniumHQ Browser Automation", driver.getTitle());
	}

	public void clickonDownlodbutton() {
		driver.findElement(By.linkText("Downloads")).click();
	}

	public void verifyDownloadPage() {
		Assert.assertEquals("Downloads", driver.getTitle());
	}

	public void clickOnAboutSection() {
		driver.findElement(By.cssSelector("#aboutArrow")).click();
	}

	public void verifyGovernancepage() {
		driver.findElements(By.cssSelector(".subnav.subnav-item")).get(1).click();
		Assert.assertEquals("https://www.selenium.dev/project/", driver.getCurrentUrl());
	}

	public void clickDocumentation() {
		driver.findElement(By.linkText("Documentation")).click();
	}
}