package com.lumens.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class ZipCodePage extends Base{
    
    @FindBy(xpath="//div[@class='checkout-card px-3']//button[@type='submit']")
    WebElement secureCheckOut;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_firstName")
    WebElement firstName;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_lastName")
    WebElement lastName;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_address1")
    WebElement address;
    
    @FindBy(xpath="//a[text()='Enter address manually']")
    WebElement enterAddressClick;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_city")
    WebElement city;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_states_stateUS")
    WebElement selectState;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_postal")
    WebElement postalCode;
    
    @FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_phone")
    WebElement phoneNumber;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement submit;
    
    public ZipCodePage() {
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
    
    public void enterZipCode() {
    	  WebDriverWait wait = new WebDriverWait(driver,50);
    	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='checkout-card px-3']//button[@type='submit']")));
    	   	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",secureCheckOut);
        
        firstName.sendKeys("Dharani");
        lastName.sendKeys("M");
        address.sendKeys("Kings landing");
        
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();",enterAddressClick );
      
        city.sendKeys("Winter fell");
        Select select=new Select(selectState);
        select.selectByIndex(1);
        postalCode.sendKeys("123");
        phoneNumber.sendKeys("8124926240");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click();",submit );
       
        
        
    }
    

 

}