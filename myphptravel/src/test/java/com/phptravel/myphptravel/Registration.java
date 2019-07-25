package com.phptravel.myphptravel;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage;
import pageObjects.Homepage;
import pageObjects.RegisterPage;

public class Registration {
	
	private Homepage phptravelpage = new Homepage();
	private RegisterPage regpage = new RegisterPage();
	private AccountPage accpage = new AccountPage();
	
	@Given("^user open PHP travel website$")
    public void user_open_php_travel_website() throws Throwable {
		phptravelpage.openHomepage();
		
        //throw new PendingException();
    }

    @When("^user click signup menu to open registration form$")
    public void user_click_signup() throws Throwable {
        phptravelpage.clickSignup();
       
    	//throw new PendingException();
    }
    
    @And("^user input correct data$")
    public void user_input_correct_data() throws Throwable {
        regpage.fillregistration();        
    	//throw new PendingException();
    }   
        
    @Then("^user should be in account page$")
    public void user_should_be_in_account_page() throws Throwable {
        
    	if (accpage.VerifyAccountPage()) {
    		System.out.println("You have successfully created account!");
    	} else
    		System.out.println("You haven't created account!");
    	
    	//throw new PendingException();
    	accpage.driverquit();
    }
       
    @And("^user click sign up button$")
    public void user_click_sign_up_button() throws Throwable {
    	regpage.submitdata();
    	Thread.sleep(2000);
    	//throw new PendingException();
    }
    
}
