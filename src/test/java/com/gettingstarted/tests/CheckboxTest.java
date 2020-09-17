package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.CheckBoxPage;

@RunWith(SerenityRunner.class)
public class CheckboxTest {
	@Managed
	WebDriver driver;
	
	
	CheckBoxPage page;
	
	@Test
	public void testCheckbox() {
		
		page.selectCheckBox();
	}
}
