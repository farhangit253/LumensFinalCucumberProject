package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class SignOutPage extends Base{
	
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement popup;
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement mouseOverOnAccount;
	
	@FindBy(xpath="//div[@class='dropdown-menu']//a[text()='Sign In']")
	WebElement signIn;
	    
	 @FindBy(id="dwfrm_login_username")
	 WebElement email;
	    
	 @FindBy(id="dwfrm_login_password")
	 WebElement password;
	    
	@FindBy(xpath="//button[@name='dwfrm_login_login']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement againMouseOverOnAccount;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signOut;
	       
      public SignOutPage() {
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      PageFactory.initElements(driver, this);
	    }
      
    public void selectSignIn() {
    popup.click();
    Actions action = new Actions(driver);
    action.moveToElement(mouseOverOnAccount).build().perform();
    signIn.click();
}

   public void login(String emailId, String passWord) throws InterruptedException {
	   
//	   try {
//		   WebDriverWait wait = new WebDriverWait(driver,20);
//		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//		email.sendKeys(emailId);
//		}
//		catch(org.openqa.selenium.StaleElementReferenceException ex)
//		{
//			WebDriverWait wait = new WebDriverWait(driver,20);
//		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//		email.sendKeys(emailId);
//		}
	   
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
	   	
	email.sendKeys(emailId);
	   
//	   try {
//		   WebDriverWait wait1 = new WebDriverWait(driver,20);
//		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//			password.sendKeys(passWord);
//		}
//		catch(org.openqa.selenium.StaleElementReferenceException ex)
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver,20);
//		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//			password.sendKeys(passWord);
//		}

	WebDriverWait wait1 = new WebDriverWait(driver,20);
  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
  
	password.sendKeys(passWord);
	
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", loginButton);
   
}
   
   public void signOut() {
	   Actions action = new Actions(driver);
	    action.moveToElement(againMouseOverOnAccount).build().perform();
	    
//	    WebDriverWait waits = new WebDriverWait(driver,50);
//		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign Out']")));
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", signOut);
        
	    System.out.println("user signed out succesfully");
   }

}
