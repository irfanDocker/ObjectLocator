package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.ClickSomething;

@RunWith(SerenityRunner.class)
public class ClickSomethingTest {
	
	@Managed
	WebDriver driver;
	
	ClickSomething page;
	
	@Test
	public void openBrowserTest() {
		//page.openBrowser();
		
		//page.clickOnLink();
		
		page.printAllLinkText();
		
	}
	
	
}
