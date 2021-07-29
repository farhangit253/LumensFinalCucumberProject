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

public class AccountCreationPage extends Base {
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement popup;
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement mouseOverOnAccount;
	
	@FindBy(id="my_account_hdr_link")
	WebElement selectMyAccount;
	
	@FindBy(id="dwfrm_profile_customer_firstname")
	WebElement firstName;
	
	@FindBy(id="dwfrm_profile_customer_lastname")
	WebElement lastName;
	
	@FindBy(id="dwfrm_profile_customer_email")
	WebElement email;
	
	@FindBy(id="dwfrm_profile_customer_emailconfirm")
	WebElement confirmEmail;
	
	@FindBy(id="dwfrm_profile_login_password")
	WebElement password;
	
	@FindBy(id="dwfrm_profile_login_passwordconfirm")
	WebElement confirmPassword;
	
	@FindBy(xpath="//span[text()='Create Account']")
	WebElement clickOnCreateAccount;
	
	public void AccountCreationPage() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void mouseOverOnAccountAndClickMyAccount() {
		popup.click();
		Actions act=new Actions(driver);
		act.moveToElement(mouseOverOnAccount).build().perform();
		
		  WebDriverWait wait = new WebDriverWait(driver,50);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("my_account_hdr_link")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", selectMyAccount);
		
		
	}
	public void fillDetails(String firstname,String lastname,String Email,String confirmemail,String Password,String confirmpassword) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(Email);
		confirmEmail.sendKeys(confirmemail);
		password.sendKeys(Password);
		confirmPassword.sendKeys(confirmpassword);
		
	}
	
	public void createAccount() {
		
		 WebDriverWait wait = new WebDriverWait(driver,50);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", clickOnCreateAccount);
		
	}

}
