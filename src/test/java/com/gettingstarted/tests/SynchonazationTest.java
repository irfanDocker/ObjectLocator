package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.SynchronazationPage;

@RunWith(SerenityRunner.class)
public class SynchonazationTest {
	@Managed
	WebDriver driver;
	
	SynchronazationPage page;
	
	@Test
	public void waitExampleTest() {
		
		page.waitExpample();
	}
}
