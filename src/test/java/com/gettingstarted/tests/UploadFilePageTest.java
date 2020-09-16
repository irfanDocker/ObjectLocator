package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.UploadFilePage;

@RunWith(SerenityRunner.class)
public class UploadFilePageTest {
	@Managed
	WebDriver driver;
	
	UploadFilePage page;
	
	
	@Test
	public void uploadTest() {
		page.uploadFile();
	}
	
	
}
