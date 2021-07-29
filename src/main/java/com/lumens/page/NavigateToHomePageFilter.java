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

public class NavigateToHomePageFilter extends Base{
	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement mouseOverOnLigtings;

	@FindBy(xpath = "//a[text()='Ceiling Lights']")
	WebElement navigateToCeilingLights;

	@FindBy(xpath = "//span[text()='Chandeliers']")
	WebElement navigateToChandeliers;

	@FindBy(xpath = "//p[text()='Large Chandeliers']")
	WebElement navigateToLargeChandeliers;

	@FindBy(xpath = "//a[contains(text(),'Archer Chandelier')]")
	WebElement selectProduct;
	
	
	public NavigateToHomePageFilter()

	{
		 //This initElements method will create all WebElements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void navigatingToLargeChandelier() {
		Actions act = new Actions(driver);
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

	public void selectProduct() {
		WebDriverWait wait2 = new WebDriverWait (driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Archer Chandelier')]")));
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", selectProduct);
	}

}
