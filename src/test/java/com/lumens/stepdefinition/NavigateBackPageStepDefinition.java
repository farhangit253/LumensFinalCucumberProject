package com.lumens.stepdefinition;

import com.lumens.page.NavigateBackPage;

import cucumber.api.java.en.Then;

public class NavigateBackPageStepDefinition {
	NavigateBackPage navigate=new NavigateBackPage();
	   
    @Then("^user should able to navigate the lights and navigate back to the homepage$")
    public void user_should_able_to_navigate_the_lights_and_navigate_back_to_the_homepage() throws Throwable {
        navigate.mouseoveronlighting();
    }

}
