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

public class ViewCartPage extends Base {

	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement lighting;
	
	@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceilingLight;
	
	@FindBy(xpath = "//a[@title='Ceiling Lights Chandeliers']")
	WebElement chandeliers;
	
	@FindBy(xpath="//p[text()='Large Chandeliers']")
	WebElement largeChandeliers;
	
	@FindBy(xpath = "//span[text()='1 business day']")
	WebElement readyToShip;
	
	@FindBy(xpath="//span[contains(text(),'Transitional')]")
	WebElement style;
	
	@FindBy(xpath="//a[@title='Studio Chandelier(Polished Nickel/5 Lights)-OPEN BOX RETURN' and @class='thumb-link']")
	WebElement product;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement checkOut;
	
	@FindBy(xpath="//a[@id='mcBookMark']")
	WebElement cart;
	
	@FindBy(xpath="//a[text()='VIEW CART']")
	WebElement viewCart;
	
	public ViewCartPage() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct() throws InterruptedException {
		
		Actions action=new Actions(driver);
		action.moveToElement(lighting).build().perform();
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", ceilingLight);
	       WebDriverWait wait = new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Ceiling Lights Chandeliers']")));
			JavascriptExecutor js1= (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click();", chandeliers);
			
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='large chandelier']")));
			JavascriptExecutor js2= (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].click();", largeChandeliers);
			
	       JavascriptExecutor js3 = (JavascriptExecutor) driver;
	       js3.executeScript("arguments[0].click();", readyToShip);
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;
	       js4.executeScript("arguments[0].click();", style);
		
	       
	       WebDriverWait wait2 = new WebDriverWait(driver,20);
		   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Studio Chandelier(Polished Nickel/5 Lights)-OPEN BOX RETURN' and @class='thumb-link']")));
		
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
	       js5.executeScript("arguments[0].click();", product);
	}
	
	
	public void addTheProductToCart() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait (driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart']")));
		
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",addToCart );
        
		
            WebDriverWait wait2 = new WebDriverWait (driver, 30);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CHECKOUT']")));
			
	        
	         JavascriptExecutor js1 = (JavascriptExecutor) driver;
	            js1.executeScript("arguments[0].click();",checkOut );
		
	}
	
	public void viewCart() {
		//cart.click();

        WebDriverWait wait2 = new WebDriverWait (driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='mcBookMark']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cart);
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", viewCart);
		//viewCart.click();
		
	}

}
