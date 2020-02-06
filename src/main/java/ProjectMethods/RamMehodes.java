package ProjectMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;


public class RamMehodes extends Report {


	public static WebDriver driver ;
	public static String surl;
	public static String sbrowser;
	public Properties prop;

	public 	RamMehodes() {

		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("D:\\CucumberTestNG\\CucumberTestNG\\src\\main\\java\\Properties\\properties")));
			surl=prop.getProperty("URL");
			sbrowser=prop.getProperty("BROWSER");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Driver" + driver);

	}	


	public static void startapp() {

		if(sbrowser.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", "E:\\NewCucumber\\CucumberWithPom\\cucumberwithpom\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		if(sbrowser.equalsIgnoreCase("FIREFOX")){ 		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium2");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(surl);

	}

	public void closebrowser(){

		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {

		} catch (WebDriverException e) {

		}
	}


	/*@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}*/


	@Override
	public long takeSnap() {
		
		// TODO Auto-generated method stub
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}
		





}

