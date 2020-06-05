package com.automation.steps;

import com.automation.pages.RegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationPageSteps {

	    RegistrationPage registrationpage = new RegistrationPage();
	    
	    @Given("^Click on Registration link$")
	    public void verifyuserisonHomepageofapplication(){
	    	registrationpage.clickonregistrationform();
	    	
	    }
	    @And("^Verify the Title$")
	    public void verifytheTitle() throws Throwable{
	    	registrationpage.verifyRegisterpagetitle();
	    }
	    @Then("^Fill the registration form$")
	    public void fillregistrationform() throws Throwable
	    {
	    	registrationpage.FillRegisterForm();
	    }
	    
	    @And("^Submit the Form$")
	    public void submittheform() throws Throwable{
	    	registrationpage.submitbutton();
	    }
	
}

  
