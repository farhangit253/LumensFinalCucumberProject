package com.lumens.stepdefinition;

import com.lumens.page.NavigateToHomePageFilter;

import cucumber.api.java.en.Then;

public class NavigateToHomeStepDefinition {
	
	NavigateToHomePageFilter homepage=new NavigateToHomePageFilter();
	
	@Then("^Selcted Product and click on cart in HomePage$")
	public void selcted_Product_and_click_on_cart_in_HomePage() throws Throwable {
		
		homepage.navigatingToLargeChandelier();
		homepage.selectProduct();
	    
	}

}
