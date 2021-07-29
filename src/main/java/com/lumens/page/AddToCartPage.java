package com.lumens.page;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class AddToCartPage extends Base  {
	
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
    
    public  AddToCartPage() {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
    }
    
    public void selectSighIn() {
    	popup.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(mouseOverOnAccount).build().perform();
    	
    	 WebDriverWait wait = new WebDriverWait(driver,20);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu']//a[text()='Sign In']")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", signIn);
    	
    }
    
    public void login(String username,String Password) throws InterruptedException {
    	
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
    	 WebDriverWait wait = new WebDriverWait(driver,20);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));
		   	
    	email.sendKeys(username);
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,20);
	   	wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
	   	
    	password.sendKeys(Password);
    	
    	loginButton.click();	
    }
	public void navigatingToLargeChandelier() {
		
		Actions act=new Actions(driver);
       act.moveToElement(mouseOverOnLigtings).build().perform();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", navigateToCeilingLights);
    	
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("arguments[0].click();", navigateToChandeliers);
       
       JavascriptExecutor js2 = (JavascriptExecutor) driver;
       js2.executeScript("arguments[0].click();", navigateToLargeChandeliers);
    	
    		
	}
	
	public void selectProductAndAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver,40);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Archer Chandelier')]")));
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", selectProduct);
		
		WebDriverWait wait1 = new WebDriverWait(driver,40);
	   	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Add to Cart']")));
	
         JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",addToCart );
        
		
		assertTrue(verifyingCartAddedSuccesfullyLogo.isDisplayed());
		System.out.println("Product Succesfully added to cart");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\Users\\khaleel055963\\Downloads\\LumensProject\\screenshot\\LumensAddToCart.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
		 WebDriverWait wait2 = new WebDriverWait (driver, 30);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CHECKOUT']")));
			
	         JavascriptExecutor js1 = (JavascriptExecutor) driver;
	            js1.executeScript("arguments[0].click();",checkOut );
		
	}
	
	
	

}
