package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.MouseActionPage;

@RunWith(SerenityRunner.class)
public class MouseActionPageTest{

	@Managed
	WebDriver driver;

	MouseActionPage page;

	@Test
	public void testAlert() {
		page.mouseHoverExample();
	}
}
