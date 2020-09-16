package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dynamic_loading/2")
public class SynchronazationPage extends PageObject{
	
	
	@FindBy(css = "#start > button")
	private WebElementFacade startButton;
	
	public void waitExpample() {
		open();
		
		waitForTitleToAppear("The Internet");
		
		startButton.waitUntilClickable().click();
		
//		startButton.click();
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
}
