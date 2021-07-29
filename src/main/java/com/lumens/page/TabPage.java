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

public class TabPage extends Base {
	
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
    
    @FindBy(xpath="//span[text()='Chandeliers']")
    WebElement navigateToChandeliers;
    
    @FindBy(xpath="//p[text()='Large Chandeliers']")
    WebElement navigateToLargeChandeliers;
    
    public  TabPage() {
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
    }
    
    public void selectSighIn() {
    	popup.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(mouseOverOnAccount).build().perform();
    	signIn.click();
    }
    
    public void login(String username,String Password) throws InterruptedException {
//    	
//    	 try {
//  		   WebDriverWait wait = new WebDriverWait(driver,20);
//  		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//  		email.sendKeys(username);
//  		}
//  		catch(org.openqa.selenium.StaleElementReferenceException ex)
//  		{
//  			WebDriverWait wait = new WebDriverWait(driver,20);
//  		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//  		email.sendKeys(username);
//  		}
//
//  	   
//  	   try {
//  		   WebDriverWait wait1 = new WebDriverWait(driver,20);
//  		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//  			password.sendKeys(Password);
//  		}
//  		catch(org.openqa.selenium.StaleElementReferenceException ex)
//  		{
//  			WebDriverWait wait1 = new WebDriverWait(driver,20);
//  		  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//  			password.sendKeys(Password);
//  		}
    	WebDriverWait wait = new WebDriverWait(driver,50);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
	   	
	email.sendKeys(username);
	
	WebDriverWait wait1 = new WebDriverWait(driver,50);
   	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
   	
	password.sendKeys(Password);
	
    	loginButton.click();	
    }
	public void navigatingToLargeChandelier() {
	
	   Actions act=new Actions(driver);
       act.moveToElement(mouseOverOnLigtings).build().perform();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", navigateToCeilingLights);
    	
       WebDriverWait wait = new WebDriverWait(driver,50);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Ceiling Lights Chandeliers']")));
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", navigateToChandeliers);
		
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='large chandelier']")));
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", navigateToLargeChandeliers);
    	
    		
	}

}
