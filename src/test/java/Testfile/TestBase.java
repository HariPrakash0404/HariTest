package Testfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	 
	 public static WebDriver driver = null;
	 
	 @BeforeSuite
	 public void initialize() throws IOException, InterruptedException{
	 
	 System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/MacSelenium/chromedriver/chromedriver");
	 driver = new ChromeDriver(); 
	 //To maximize browser
	                driver.manage().window().maximize();
	         //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 //To open facebook
	                driver.get("https://www.facebook.com");
	 
	 }
	 
	 @AfterSuite
	 //Test cleanup
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }
	 
	}