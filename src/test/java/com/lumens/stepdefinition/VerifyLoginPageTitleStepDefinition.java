package com.lumens.stepdefinition;



import com.lumens.page.VerifyLoginPageTitle;

import cucumber.api.java.en.Then;

public class VerifyLoginPageTitleStepDefinition {
	
	@Then("^verify the title of lumens page$")
	public void verify_the_title_of_lumens_page() throws Throwable {
		
		VerifyLoginPageTitle title=new VerifyLoginPageTitle();
		
		title.verifyTitle();
		
		System.out.println("User successfully Verify the Title of the Page");
	    
	}

}
