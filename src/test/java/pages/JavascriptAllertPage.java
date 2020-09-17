package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
public class JavascriptAllertPage  extends PageObject{

	                  //*[@id="content"]/div/ul/li[1]/button
	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
	private WebElementFacade regularAlert;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
	private WebElementFacade confirmAlert;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/button")
	private WebElementFacade promptAlert;
	
	public void workingWithalert() {
		open();
		
		confirmAlert.click();
		
		System.out.println(getAlert().getText());
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getAlert().accept();
		
		
	}
	
	
	
	public void workingWithConfirmAlert() {
		open();
		
		confirmAlert.click();
		
		System.out.println(getAlert().getText());
		
//		getAlert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		getAlert().dismiss();
		
		
	}
	
	
	
	public void workingWithpromptAlert() {
		open();
		
		promptAlert.click();
		
		System.out.println(getAlert().getText());
		
//		getAlert().accept();
		
//		getAlert().dismiss();
		
		getAlert().sendKeys("techcircle");
		System.out.println(getAlert().getText());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getAlert().accept();

		
		
		
	}
	
}
