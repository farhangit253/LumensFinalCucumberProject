package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class SearchProductPage extends Base {
	
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
	
	@FindBy(xpath = "//input[@class='simplesearchinput']")
	WebElement searchBar;
	     
     @FindBy(id= "simplesearchbtn")
     WebElement searchButton;
	     
	     public SearchProductPage() {
	       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	       PageFactory.initElements(driver, this);
	        }
	     public void searchProduct() {
	    	 
	    	 WebDriverWait wait = new WebDriverWait (driver, 40); 
	    	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='simplesearchinput']"))));
	    	 
	    	 searchBar.click();
	         searchBar.sendKeys("lights");
	         JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].click();", searchButton);
		     System.out.println("item searching is succesfull");  

	        }
	    
}

