package com.pages;

import org.junit.Assert;

import com.runner.BaseClass;

public class SponsorPage extends BaseClass {
	public void verifySponsorPage() {

		Assert.assertEquals("Sponsor", driver.getTitle());
	}
}
