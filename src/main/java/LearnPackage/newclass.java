package LearnPackage;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class newclass {

	
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
	}
			
		}
	    driver.close();
		
		
		
		
		
/*		
		
		 WebElement id = driver.findElementById("z_80-cave");
		    List<WebElement> list1 = id.findElements(By.tagName("li"));
		    
		    for (WebElement obj : list1) {
		    	System.out.println(obj.getText());
			
		   if(obj.getText().equals("WIC - Concord")){
			   obj.click();
			   
		   }
	 } 
	}		
		
		
		
		
		
		
		
		
		
		
		
        WebElement select = driver.findElementByXPath("//select[@formcontrolname='nationality']");	
		Select sel = new Select(select);
		List<WebElement> list =sel.getOptions();
		int size = list.size();
		System.out.println(size);
		sel.selectByIndex(size-33);
		for (int i = 0;i<=size;i++) {
			System.out.println(list.get(i).getText());
		}
		
		*/
		
		
		
		
		
		
		
		/*
		String str;
		
		System.out.println("Enter Name:");
		
		Scanner sj = new Scanner(System.in);
		
		str = sj.nextLine();
		
		String trim = str.trim();
		
		System.out.println(trim);
		
		String split[] = trim.split(" ");
		
		String spli = split[0]+split[1];
		
		System.out.println(spli);
		
		int length = spli.length();
		
		System.out.println(length);
		
		if(length%2==0){
			
			System.out.println("Its a even number");
		}
		else{
			
			System.out.println("Its a odd Number");
		}
		
		*/
		
			
				
		
		
	}
	
}