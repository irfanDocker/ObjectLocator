package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;
@DefaultUrl("/checkboxes")
public class CheckBoxPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
	private WebElementFacade checkbox1;
	
	@FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
	private WebElementFacade checkbox2;
	
	
	public void selectCheckBox() {
		
		open();
		
		
		Checkbox box = new Checkbox(checkbox1);
		
		box.setChecked(true);
		
		Checkbox box2 = new Checkbox(checkbox2);
		
		box2.setChecked(false);
		
		
		System.out.println(box.isChecked());
		System.out.println(box2.isChecked());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
