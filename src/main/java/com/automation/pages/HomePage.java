package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.DriverUtils.getDriver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(name = "userName")
    private  WebElement userName;

    @FindBy(name = "password")
    private  WebElement password;

    @FindBy( name= "login")
    private WebElement signinBtn;
    
    @FindBy(linkText = "Home")
    private WebElement Homebtn;
    
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;
    
    @FindBy(id = "twotabsearchtextbox")
    private WebElement actualTitle;
    
    @FindBy(xpath="//title[contains(text(),'Sign-on: Mercury Tours')]")
    private WebElement signonTitle;
    
    public void verifyHomepage(){
    	String actualTitle = getDriver().getTitle();
    	String Expected = "Welcome: Mercury Tours";

        if (actualTitle.equals(Expected)) {
                   System.out.println("Test Passed!");
        } else {
                   System.out.println("Test Failed");
        }

    	
    }
    public void navigateToLoginPage() {
    	signinBtn.click();
    }
    
        public void enterusernameandpassword() throws Throwable{
        Thread.sleep(3000);
    	userName.sendKeys("test");
    	password.sendKeys("test");
    }
    public void closeDriver(){
    	getDriver().close();
    }
    
    public void userlogin(String email,String pwd) throws Throwable{
    	Thread.sleep(3000);
    	userName.sendKeys(email);
    	Thread.sleep(3000);
    	password.sendKeys(pwd);
    	Thread.sleep(3000);
    	
    }
    
    public void verifysignonpagetitle() throws Throwable{
        Thread.sleep(5000);
    	String signonTitle = getDriver().getTitle();
    	String Expected = "Sign-on: Mercury Tours";

        if (signonTitle.equals(Expected)) {
                   System.out.println("Test Passed!");
        } else {
                   System.out.println("Test Failed");
        }

    	
    }
}
