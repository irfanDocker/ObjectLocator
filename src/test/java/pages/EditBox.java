package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("/login")
public class EditBox extends PageObject {

	@FindBy(id = "username")
	private WebElementFacade username;

	@FindBy(id = "password")
	private WebElementFacade password;

	@FindBy(xpath = "//*[@id=\"login\"]/button/i")
	private WebElementFacade loginButton;

	
	public void login(String name,String pass) {
		

		
		open();
		
		
		try {
			username.sendKeys(name);
			Thread.sleep(1000);
			password.sendKeys(pass);
			Thread.sleep(1000);
			loginButton.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void loginWithSerenityMethod(String name,String pass) {

		
		open();
		
		try {
			//clears field first before entering text
			username.type(name);
			Thread.sleep(1000);
			
			
			//typeAndEnter:=> Type & hit the enter key
//			password.typeAndTab(pass);
			password.typeAndEnter(pass);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

}
