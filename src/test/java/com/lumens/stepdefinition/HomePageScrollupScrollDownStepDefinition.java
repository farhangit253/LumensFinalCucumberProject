package com.lumens.stepdefinition;

import com.lumens.page.HomePageScrollupScrollDownPage;
import cucumber.api.java.en.Then;

public class HomePageScrollupScrollDownStepDefinition {
	
	HomePageScrollupScrollDownPage scrollaction=new HomePageScrollupScrollDownPage();
	@Then("^Use scroll up/down method in home page$")
	public void use_scroll_up_down_method_in_home_page() throws Throwable {
	    
		
		scrollaction.Scrolldown();
		scrollaction.Scrollup();
		
	}

}
