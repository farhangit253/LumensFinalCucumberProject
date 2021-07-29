package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utils.Base;

public class HomePageScrollupScrollDownPage extends Base{
	
	@FindBy(xpath="//img[@alt='Shop All Ceiling Fans']")
	WebElement ceilingFans;
	
	
	@FindBy(xpath="//img[@alt='Shop All Gus Modern']")
	WebElement gusModern;
	
	public HomePageScrollupScrollDownPage(){
		 //This initElements method will create all WebElements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void Scrolldown(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
   
    public void Scrollup(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
    }

}
