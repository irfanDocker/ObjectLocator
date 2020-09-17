package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dropdown")
public class Dropdown extends PageObject {
	
	@FindBy(id = "dropdown")
	private WebElementFacade dropdown;
	
	public void selectValue(String option) {
		
		open();
		
		selectFromDropdown(dropdown, option);
		
		System.out.println(getSelectedLabelFrom(dropdown));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
