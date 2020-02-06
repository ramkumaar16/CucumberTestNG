package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how=How.ID,using="addproject")
	private WebElement clickproject;
	public HomePage createproject() throws InterruptedException{
		Thread.sleep(1000);
		clickproject.click();
		return this;	
	}
	
	@FindBy(how=How.ID,using="projectname")
	private WebElement typeName;
	public HomePage typename(){
		typeName.sendKeys("jamessasaamoner");
		takeSnap();
		System.out.println("passed");
		return this;	
	}
	
	@FindBy(how=How.ID,using="createproject")
	private WebElement createProject;
	public HomePage project(){
		createProject.click();
		//takeSnap();
		//switchToWindow(1);
		return new AddSPrintandTask();	
		
	}

}
