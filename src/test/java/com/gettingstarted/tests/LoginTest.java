package com.gettingstarted.tests;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import pages.EditBox;

@RunWith(SerenityRunner.class)
public class LoginTest {
	@Managed
	WebDriver driver;
	
	EditBox page;
	
	@Title("This is going to login with incorrect credential")
	@Test
	public void loginWithIncorrectCredentials() {
		
		page.loginWithSerenityMethod("irfan", "tursun");

	}
	
	
	@Title("This is going to login with correct credential")
	@Test
	public void loginWithCorrectCredentials() {
		
		page.login("tomsmith", "SuperSecretPassword!");
	}
}
