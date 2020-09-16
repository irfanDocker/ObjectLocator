package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import pages.LocatorExample;

@RunWith(SerenityRunner.class)
public class LocatorTest {

	
	@Managed
	WebDriver driver;
	
	LocatorExample page;
	
	@Title("This is my first serenity test method!!!!!")
	@Test
	public void locatorTest() {
		
//		page.clickOnLink();
		
		page.printAllLinkText();
	}
}
