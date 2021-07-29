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

public class PromoCodePage extends Base {
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
    
    @FindBy(xpath="//a[contains(text(),'Archer Chandelier')]")
    WebElement selectProduct;
    
    @FindBy(xpath="//button[@title='Add to Cart']")
    WebElement addToCart;
    
    @FindBy(xpath="//div[text()='Archer Chandelier added to your cart']")
    WebElement verifyingCartAddedSuccesfullyLogo;
    
    @FindBy(xpath="//a[text()='CHECKOUT']")
    WebElement checkOut;
    
    @FindBy(xpath="//input[@name='dwfrm_cart_couponCode']")
    WebElement enterCouponCode;
    
    @FindBy(xpath="//span[text()='Apply']")
    WebElement apply;
        
     public PromoCodePage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         PageFactory.initElements(driver, this);              
         }
            
   public void selectSignIn() {
   popup.click();
   Actions action = new Actions(driver);
   action.moveToElement(mouseOverOnAccount).build().perform();
   signIn.click();
   }

  public void login(String emailId, String passWord) throws InterruptedException {
//	  try {
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
//
//	   
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
	  
	  WebDriverWait wait = new WebDriverWait(driver,20);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
	email.sendKeys(emailId);
	
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
 	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
 	
	password.sendKeys(passWord);
	
       loginButton.click();
       System.out.println("User logined successfully");
  }
  
  public void navigatingToLargeChandelier() {
        
     Actions act=new Actions(driver);
     act.moveToElement(mouseOverOnLigtings).build().perform();
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", navigateToCeilingLights);
      
     WebDriverWait wait = new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Ceiling Lights Chandeliers']")));
	JavascriptExecutor js1= (JavascriptExecutor) driver;
	js1.executeScript("arguments[0].click();", navigateToChandeliers);
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='large chandelier']")));
	JavascriptExecutor js2= (JavascriptExecutor) driver;
	js2.executeScript("arguments[0].click();", navigateToLargeChandeliers);
	
             
    }
    
    public void selectProductAndAddToCart() {
        
    	WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Archer Chandelier')]")));
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", selectProduct);
		
		WebDriverWait wait1 = new WebDriverWait (driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Add to Cart']")));
		
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",addToCart );
        

        System.out.println("Product Succesfully added to cart");
        
        WebDriverWait wait2 = new WebDriverWait (driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CHECKOUT']")));
		
        
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click();",checkOut );
        
 
    }
    
  
  public void applyCouponCode(String coupon) {
      
      enterCouponCode.sendKeys(coupon);
      
      WebDriverWait wait2 = new WebDriverWait (driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Apply']")));
      
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("arguments[0].click();", apply);
  }
}
