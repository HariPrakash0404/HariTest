package Testfile;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.FBLoginPage;
 
 
public class FBLoginTest extends TestBase{
 
 @Test
 public void init() throws Exception{
 
 FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
 loginpage.setEmail("Hariprakash.thi@gmail.com");
 loginpage.setPassword("Aadhav@1104");
 loginpage.clickOnLoginButton();
 }
 
}