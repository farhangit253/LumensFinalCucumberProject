package com.lumens.stepdefinition;

import com.lumens.page.ZipCodePage;
import com.lumens.utils.Base;

import cucumber.api.java.en.Then;

public class VerifyZipCodeStepDefinition extends Base{
	
	 ZipCodePage zipCode = new ZipCodePage();;
	    
	    @Then("^enter the zipCode$")
	    public void enter_the_zipCode() throws Throwable {
	        
	        zipCode.enterZipCode();

}

}