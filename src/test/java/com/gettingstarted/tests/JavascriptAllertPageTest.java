package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.JavascriptAllertPage;

@RunWith(SerenityRunner.class)
public class JavascriptAllertPageTest {
	@Managed
	WebDriver driver;
	
	JavascriptAllertPage page;
	
	@Test
	public void testAlert() {
		page.workingWithalert();
	}
	
	@Test
	public void canceltAlert() {
		page.workingWithConfirmAlert();
	}
	
	
	@Test
	public void promptAlertTest() {
		page.workingWithpromptAlert();
	}
	
	
	
}
