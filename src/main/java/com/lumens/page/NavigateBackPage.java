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

public class NavigateBackPage extends Base  {

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
    
    @FindBy(xpath="//span[@title='Lighting']")
    WebElement mouseOverOnLigtings;
    
    @FindBy(xpath="//a[text()='Ceiling Lights']")
    WebElement navigateToCeilingLights;
    
    
    
     public  NavigateBackPage() {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            PageFactory.initElements(driver, this);
        }
        
        public void selectSighIn() {
            popup.click();
            Actions act=new Actions(driver);
            act.moveToElement(mouseOverOnAccount).build().perform();
            signIn.click();
        }
        
        public void login(String username,String Password) throws InterruptedException {
        	
//        	 try {
//      		   WebDriverWait wait = new WebDriverWait(driver,20);
//      		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//      		email.sendKeys(username);
//      		}
//      		catch(org.openqa.selenium.StaleElementReferenceException ex)
//      		{
//      			WebDriverWait wait = new WebDriverWait(driver,20);
//      		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//      		email.sendKeys(username);
//      		}
//      	   
//
//      	   
//      	   try {
//      		   WebDriverWait wait1 = new WebDriverWait(driver,20);
//      		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//      			password.sendKeys(Password);
//      		}
//      		catch(org.openqa.selenium.StaleElementReferenceException ex)
//      		{
//      			WebDriverWait wait1 = new WebDriverWait(driver,20);
//      		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//      			password.sendKeys(Password);
//      		}
        	WebDriverWait wait = new WebDriverWait(driver,20);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
		   	
    	email.sendKeys(username);
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,20);
	   	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
	   	
    	password.sendKeys(Password);
    	
            loginButton.click();    
        }
        public void mouseoveronlighting() throws InterruptedException {
            
        	
            Actions actions = new Actions(driver);         
             actions.moveToElement(mouseOverOnLigtings).build().perform();
            
          
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", navigateToCeilingLights);
            
             driver.navigate().back();
        }
}