package com.lumens.page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
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

public class IncreaseQuantityOfProduct extends Base{
	
	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement lighting;
	
	@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceilingLight;
	
	@FindBy(xpath = "//a[@title='Ceiling Lights Chandeliers']")
	WebElement chandeliers;
	
	@FindBy(xpath = "//a[text()='large chandelier']")
	WebElement largeChandeliers;
	
	  @FindBy(xpath="//a[contains(text(),'Archer Chandelier')]")
	    WebElement selectProduct;
	  
	@FindBy(id="Quantity")
	WebElement quantity;
	
	
	
	
	public IncreaseQuantityOfProduct() {
		PageFactory.initElements(driver, this);
		
	}
	public void increaseQuantity() throws InterruptedException {
		
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
		

		WebDriverWait wait2 = new WebDriverWait(driver,20);
		   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Archer Chandelier')]")));
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", selectProduct);
		
		
		quantity.clear();
		quantity.sendKeys("2");
		System.out.println("Quantity increased");        
	       
	        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileHandler.copy(srcfile, new File("C:\\Users\\khaleel055963\\Downloads\\LumensProject\\screenshot\\ProductQuantityIncreased.png"));
				System.out.println("screenshot taken");
			}catch(IOException e){
				e.printStackTrace();
			}
		
	    }
		
		
	}


