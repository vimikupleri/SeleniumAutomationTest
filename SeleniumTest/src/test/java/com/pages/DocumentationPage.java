package com.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

public class DocumentationPage extends BaseClass {

	public void verifyDocumentationPage() {
		Assert.assertEquals("https://www.selenium.dev/documentation/en/", driver.getCurrentUrl());
	}

	public void enterSearchBox(String searchWord) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#search-by"))));
		driver.findElement(By.cssSelector("#search-by")).sendKeys(searchWord);
		driver.findElement(By.cssSelector("#search-by")).click();

	}

	public void selectSearchresult() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='autocomplete-suggestions ']/div[contains(text(),'Grid 3')]")));
		driver.findElement(By.xpath("//div[@class='autocomplete-suggestions ']/div[contains(text(),'Grid 3')]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void verifyGrid3DocumentationPage() {
		Assert.assertEquals("Grid 3 :: Documentation for Selenium", driver.getTitle());

	}

}
