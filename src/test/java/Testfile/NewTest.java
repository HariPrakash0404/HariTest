package Testfile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void sample() throws InterruptedException {
	    System.out.println(driver.getTitle());
	    Actions ToolTip1 = new Actions(driver);
	    WebElement googleLogo = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]]"));

	    Thread.sleep(2000);

	    ToolTip1.clickAndHold(googleLogo).perform();
	    
	    String ToolTipText = googleLogo.getAttribute("title");

	    Assert.assertEquals(ToolTipText, "Google");

	    Thread.sleep(2000);
	    System.out.println("Tooltip value is: " + ToolTipText);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
