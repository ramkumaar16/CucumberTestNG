package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddSPrintandTask extends HomePage {
	
	public AddSPrintandTask() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//button[@class='btn success-btn'])[1]")
	private WebElement elesprint;
	public AddSPrintandTask clicksprint() throws InterruptedException{
		Thread.sleep(3000);
		elesprint.click();
		
		return this;	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='Sprint Name']")
	private WebElement eleSprint;
	public AddSPrintandTask sprintname(){
		eleSprint.sendKeys("HMTPROJECT");
		//takeSnap();
		return this;	
	}

	@FindBy(how=How.ID,using="startdate-input")
	private WebElement elestartdate;
	public AddSPrintandTask select1stdate(){
		elestartdate.sendKeys("2/04/2020");
		//takeSnap();
		return this;	
	}
	

	@FindBy(how=How.ID,using="enddate-input")
	private WebElement elesenddate;
	public AddSPrintandTask selectlastdate(){
		elesenddate.sendKeys("2/05/2020");
		takeSnap();
		return this;	
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-success']")
	private WebElement eleclicksprint;
	public AddSPrintandTask createsprint() throws InterruptedException{
		Thread.sleep(4000);
		eleclicksprint.click();
		return this;	
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='progress-block'])[4]")
	private WebElement ele1stclicksprint;
	public AddSPrintandTask sprintclick() throws InterruptedException{
		Thread.sleep(2000);
		ele1stclicksprint.click();
		return this;	
	}
	
	@FindBy(how=How.ID,using="addtask")
	private WebElement addTask;
	public AddSPrintandTask addTask(){
		for(int i=1;i<=10;i++)
		addTask.sendKeys("ram"+Keys.TAB);
		closebrowser();
		return this;
		
		
	}

}
