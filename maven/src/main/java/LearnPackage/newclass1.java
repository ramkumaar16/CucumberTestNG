package LearnPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newclass1 {

	@Test()
public void mylogin() throws InterruptedException{
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);

		WebElement id = driver.findElementByXPath("//label[text()='Select Occupation']");
		id.click();
		List<WebElement> list1 = id.findElements(By.xpath("//ul[@class='ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c12-8 ng-star-inserted']"));
		
		for (WebElement obj : list1) {
			
			System.out.println(obj.getText());
			
			if(obj.getText().equalsIgnoreCase("PUBLIC")){
				obj.click();
                System.out.println("Passed");
			}
		}
}
}
		

