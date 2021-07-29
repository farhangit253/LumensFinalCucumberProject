package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.PromoCodePage;

import cucumber.api.java.en.Then;

public class PromoCodePageStepDefinition {
	
	LumensData exceldata=new LumensData();
    PromoCodePage promo=new PromoCodePage();
   
    @Then("^user should click on cart and enter the coupon code and click apply$")
    public void user_should_click_on_cart_and_enter_the_coupon_code_and_click_apply() throws Throwable {
         ArrayList<String> testdata=exceldata.getData("Coupon");
         promo.applyCouponCode(testdata.get(1));
    }
}
