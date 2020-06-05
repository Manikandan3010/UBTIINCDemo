package com.automation.steps;

import com.automation.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homepage = new HomePage();
    
    @Given("^User is on Homepage of the application$")
    public void verifyuserisonHomepageofapplication(){
    	homepage.verifyHomepage();
    	
    }

    @When("^User navigates to login page$")
    public void verifyUserIsonLoginPage()throws Throwable {
        homepage.navigateToLoginPage();
    }
    
    @And("^enter the User credentials with \"([^\"]*)\" and \"([ \"]*)\"$")
    public void verifyTitleoftheHomepage()throws Throwable{
    	homepage.enterusernameandpassword();
    	
    	
    }
    @Then("^Verify user on login page$")
    public void verifyuseronLoginPage(){
    	  	
    }
    @When("^User logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userloginwithvalidusername(String email, String pwd)throws Throwable{
    	homepage.userlogin(email, pwd);
    	
    	
    }
    @Then("^Close the browser$")
    public void closebrowser(){
    	homepage.closeDriver();
    }
    
    @And("^verify the Title$")
    public void verifySignonTitle() throws Throwable{
    	Thread.sleep(4000);
    	homepage.verifysignonpagetitle();
    }

}
