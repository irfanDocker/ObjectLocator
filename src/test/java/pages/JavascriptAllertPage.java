package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
public class JavascriptAllertPage  extends PageObject{

	
	@FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Alert']")
	private WebElementFacade regularAlert;
	
	@FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Confirm']")
	private WebElementFacade confirmAlert;
	
	@FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Prompt']")
	private WebElementFacade promptAlert;
	
	public void workingWithalert() {
		open();
		
		confirmAlert.click();
		
		System.out.println(getAlert().getText());
		
		getAlert().accept();
		
		
	}
	
	
	
	public void workingWithConfirmAlert() {
		open();
		
		regularAlert.click();
		
		System.out.println(getAlert().getText());
		
//		getAlert().accept();
		
		getAlert().dismiss();
		
		
	}
	
	
	
	public void workingWithpromptAlert() {
		open();
		
		regularAlert.click();
		
		System.out.println(getAlert().getText());
		
//		getAlert().accept();
		
//		getAlert().dismiss();
		
		getAlert().sendKeys("techcircle");
		System.out.println(getAlert().getText());
		getAlert().accept();

		
		
		
	}
	
}
