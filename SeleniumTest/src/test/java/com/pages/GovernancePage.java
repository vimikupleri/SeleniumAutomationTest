package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.runner.BaseClass;

public class GovernancePage extends BaseClass {

	public void clickOnLearnMore() {
		Assert.assertEquals("https://www.selenium.dev/project/", driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector(".button")).click();
	}

}
