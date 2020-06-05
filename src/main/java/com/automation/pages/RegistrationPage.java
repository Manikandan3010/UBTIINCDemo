package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	 public RegistrationPage() {
	        PageFactory.initElements(getDriver(), this);
	    }

	 @FindBy(xpath = "//a[contains(text(),'registration')]")
	 private  WebElement Registrationlink;
	 
	 @FindBy(name="firstName")
     private WebElement Firstname;
	 
	 @FindBy(name="lastName")
	 private WebElement lastname;
	 
	 @FindBy(name="phone")
	 private WebElement Phone;
	 
	 @FindBy(xpath="//input[@id='userName']")
	 private WebElement Email;
	 
	 @FindBy(xpath="//input[@name='address1']")
	 private WebElement Address;
	 
	 @FindBy(xpath="//input[@name='city']")
	 private WebElement City;
	 
	 @FindBy(xpath="//input[@name='state']")
	 private WebElement state;
	 
	 @FindBy(name="postalCode")
	 private WebElement postcode;
	 
	 @FindBy(name="country")
	 private WebElement Country;
	 
	 @FindBy(xpath="//input[@id='email']")
	 private WebElement email;
	 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement Pass;
	 
	 @FindBy(xpath="//input[@name='confirmPassword']")
	 private WebElement ConfirmPass;
	 
	 @FindBy(xpath="//input[@name='register']")
	 private WebElement Submit;
	 
	 
	 
	 

	 public void clickonregistrationform(){
		 Registrationlink.click();
	 }
	 
	 public void FillRegisterForm() throws Throwable{
		 Firstname.sendKeys("TestFirst1");
		 lastname.sendKeys("TestLastname1");
		 Phone.sendKeys("90976363251");
		 Email.sendKeys("Test123@gmail.com");
		 Address.sendKeys("TestAddres1");
		 City.sendKeys("TestCIty1");
		 Thread.sleep(2000);
		 state.sendKeys("TestState1");
		 postcode.sendKeys("6061231");
		 Country.click();
		 Thread.sleep(2000);
		 Select s1=new Select(Country);
		 s1.selectByVisibleText("INDIA");
		 email.sendKeys("test124@gmail.com");
		 Pass.sendKeys("Password@123");
		 ConfirmPass.sendKeys("Password@123");
		
		 
		 
	 }

	 public void verifyRegisterpagetitle() throws Throwable{
	        Thread.sleep(5000);
	    	String VerifyRegisterPageTitle = getDriver().getTitle();
	    	String Expected = "Register: Mercury Tours";

	        if (VerifyRegisterPageTitle.equals(Expected)) {
	                   System.out.println("Title Match");
	        } else {
	                   System.out.println("Title not matched");
	        }

	    	
	    }
	 public void submitbutton() throws Throwable{
		 Thread.sleep(3000);
		 Submit.click();
	 }
}
