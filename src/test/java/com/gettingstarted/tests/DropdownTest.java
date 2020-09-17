package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.Dropdown;

@RunWith(SerenityRunner.class)
public class DropdownTest {
	
	
	@Managed
	WebDriver driver;
	
	Dropdown page;
	
	@Test
	public void testingDropdownObject() {
		page.selectValue("Option 1");
		
	}
	
	
}
