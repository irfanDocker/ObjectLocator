package pages;

import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClickSomething extends PageObject{
	

	public void openBrowser(){
		open();
	}
	
	
	
	
	public void clickOnLink() {
		
		open();
		//Selenium
		//WebElement link = getDriver().findElement(By.xpath("//div[@id='content']/ul//a[@href='/abtest']"));
		
		//find(By.xpath("//div[@id='content']/ul//a[@href='/abtest']")).click();
		
//		find(By.tagName("a"),By.className(""),By.id(""));
		
		//$("//div[@id='content']/ul//a[@href='/abtest']").click();
		
		$("//*[@id=\"content\"]/ul/li[5]/a").click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printAllLinkText() {
		
		open();
		
//		List<WebElement> links = getDriver().findElements(By.tagName("a"));
//		
//		for(WebElement a : links) {
//			System.out.println(a.getText());
//		}
		
		
		
		List<WebElementFacade> links = findAll(By.tagName("a"));
		
		for (WebElementFacade webElementFacade : links) {
			System.out.println(webElementFacade.getText());
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
