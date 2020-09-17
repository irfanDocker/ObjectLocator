package pages;

import java.io.File;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("/upload")
public class UploadFilePage  extends PageObject{

	@FindBy(xpath = "//*[@id=\\\"file-upload\\\"]")
	private WebElementFacade chooseFileButton;
	
	
	@FindBy(xpath = "//*[@id=\\\"file-submit\\\"]")
	private WebElementFacade submitFileButton;
	
	
	
	public void uploadFile() {
		
		open();
		
		String path = System.getProperty("user.dir")+File.separator + "TestData//great-job-congratulations.jpg";
	
		upload(path).to($("//*[@id=\"file-upload\"]"));
//		waitFor(chooseFileButton);
//		upload(path).to(chooseFileButton);
		
		$("//*[@id=\"file-submit\"]").click();
//		waitFor(submitFileButton);
//		submitFileButton.click();
//		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
