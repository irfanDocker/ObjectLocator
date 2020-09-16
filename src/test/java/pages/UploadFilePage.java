package pages;

import java.io.File;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("/upload")
public class UploadFilePage  extends PageObject{

	
	
	public void uploadFile() {
		
		open();
		
		String path = System.getProperty("user.dir")+File.separator + "great-job-congratulations.jpg";
	
		upload(path).to($("//*[@id=\"file-upload\"]"));
		
		
		$("//*[@id=\"file-submit\"]").click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
