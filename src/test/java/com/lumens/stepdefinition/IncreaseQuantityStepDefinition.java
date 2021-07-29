package com.lumens.stepdefinition;

import com.lumens.page.IncreaseQuantityOfProduct;
import com.lumens.utils.Base;

import cucumber.api.java.en.Then;

public class IncreaseQuantityStepDefinition extends Base{
	
	IncreaseQuantityOfProduct increase;

	@Then("^select the product and increase the quantity of the product$")
	public void select_the_product_and_increase_the_quantity_of_the_product() throws Throwable {
		increase=new IncreaseQuantityOfProduct();
		increase.increaseQuantity();
	    
	}

}
