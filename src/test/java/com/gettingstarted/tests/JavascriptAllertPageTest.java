package com.gettingstarted.tests;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;
import pages.JavascriptAllertPage;

@RunWith(SerenityRunner.class)
public class JavascriptAllertPageTest {
	@Managed
	WebDriver driver;
	
	JavascriptAllertPage page;
	
	@Test
	@Title("TC123 Regular Alert")
	public void testAlert() {
		page.workingWithalert();
	}
	
	@Test
	@Title("TC124 Cancel alert")
	public void canceltAlert() {
		page.workingWithConfirmAlert();
	}
	
	
	@Test
	@Title("TC125 Prompt Alert")
	public void promptAlertTest() {
		page.workingWithpromptAlert();
	}
	
	
	
}
