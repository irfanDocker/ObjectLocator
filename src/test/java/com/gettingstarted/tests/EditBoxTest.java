package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.EditBox;

@RunWith(SerenityRunner.class)
public class EditBoxTest {

	@Managed
	WebDriver driver;
	
	EditBox page;
	
	@Test
	public void loginTest() {
		
		//page.login("tomsmith", "SuperSecretPassword!");
		page.loginWithSerenityMethod("tomsmith", "SuperSecretPassword!");
		
	}
	
	
	
}
