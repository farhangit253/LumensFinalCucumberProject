package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class VerifyLoginPageTitle extends Base{
	@FindBy(id="dwfrm_login_username")
	WebElement userName;
	
	@FindBy(name="dwfrm_login_password")
	WebElement password;
	
	@FindBy(xpath="//button[@value='Log In']")
	WebElement loginBtn;
	
	public VerifyLoginPageTitle()
	{
		 //This initElements method will create all WebElements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver,this);
	}
	
	public void login(String username,String pwd) throws InterruptedException{
		
//		 try {
//			   WebDriverWait wait = new WebDriverWait(driver,20);
//			   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//			   	userName.sendKeys(username);
//			}
//			catch(org.openqa.selenium.StaleElementReferenceException ex)
//			{
//				WebDriverWait wait = new WebDriverWait(driver,20);
//			   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
//			   	userName.sendKeys(username);
//			}
//		   
//		   
//		   try {
//			   WebDriverWait wait1 = new WebDriverWait(driver,20);
//			  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//				password.sendKeys(pwd);
//			}
//			catch(org.openqa.selenium.StaleElementReferenceException ex)
//			{
//				WebDriverWait wait1 = new WebDriverWait(driver,20);
//			  	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
//				password.sendKeys(pwd);
//			}
		WebDriverWait wait = new WebDriverWait(driver,20);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
	   
	   	userName.sendKeys(username);
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
   	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
   
	password.sendKeys(pwd);
	
		loginBtn.click();
	}
	
	public void verifyTitle(){
		String actualTitle=driver.getTitle();	
		String expectedTitle="Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";	
		Assert.assertEquals(actualTitle,expectedTitle);	
		System.out.println("Title of the Page :"+ actualTitle);
	}

}
