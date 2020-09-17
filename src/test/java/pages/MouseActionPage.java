package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("/hovers")
public class MouseActionPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/img")
	private WebElementFacade image1;

	@FindBy(xpath = "/html//div[@id='content']/div/div[2]/img[@alt='User Avatar']")
	private WebElementFacade image2;

	@FindBy(xpath = "/html//div[@id='content']/div/div[3]/img[@alt='User Avatar']")
	private WebElementFacade image3;
	
	@FindBy(xpath = "/html//div[@id='content']//a[@href='/users/1']")
	private WebElementFacade userLink1;
	


	public void mouseHoverExample() {
		
		open();
		
		withAction().moveToElement(image2).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//waitForTextToAppear("name: user1").$("/html//div[@id='content']//a[@href='/users/1']").click();
		waitForTextToAppear("name: user2").$("//*[@id=\"content\"]/div/div[2]/div/a").click();
		
		
		
//		userLink1.click();
	}

}
