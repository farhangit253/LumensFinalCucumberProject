package com.lumens.stepdefinition;

import com.lumens.page.ViewCartPage;
import com.lumens.utils.Base;

import cucumber.api.java.en.Then;

public class ViewCartStepDefinition extends Base{
	
	ViewCartPage viewCart;
	

	@Then("^Mouseover on lightenings and select the product$")
	public void mouseover_on_lightenings_and_select_the_product() throws Throwable {
		viewCart=new ViewCartPage();
		viewCart.selectProduct();
		
	}

	@Then("^add the product to the cart$")
	public void add_the_product_to_the_cart() throws Throwable {
		viewCart=new ViewCartPage();
		viewCart.addTheProductToCart();
		
		
	}

	@Then("^user is able to view the cart$")
	public void user_is_able_to_view_the_cart() throws Throwable {
		viewCart=new ViewCartPage();
		viewCart.viewCart();
		
	}

}
