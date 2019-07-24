package com.phptravel.myphptravel;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Homepage;

public class Registration {
	
	private Homepage phptravelpage = new Homepage();;
	
	@Given("^user open PHP travel website$")
    public void user_open_php_travel_website() throws Throwable {
		phptravelpage.openHomepage();
		
        //throw new PendingException();
    }

    @When("^user click signup menu to open registration form$")
    public void user_click_signup_menu_to_open_registration_form() throws Throwable {
        throw new PendingException();
    }

    @Then("^user should be in account page$")
    public void user_should_be_in_account_page() throws Throwable {
        throw new PendingException();
    }

    @And("^user input correct data$")
    public void user_input_correct_data() throws Throwable {
        throw new PendingException();
    }

    @And("^user click sign up button$")
    public void user_click_sign_up_button() throws Throwable {
        throw new PendingException();
    }
    
}
