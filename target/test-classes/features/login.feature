@login
Feature: Login Functionality

  @Test1
  Scenario: Verify valid user login
    Given User is on Homepage of the application
    When User navigates to login page

  @Test
  Scenario Outline: Verify user login
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
    And verify the Title
    Then Close the browser

    Examples: 
      | emailId        | pwd    |
      | Test@gmail.com | 123456 |
      
  @RegistrationForm
  Scenario Outline: Verify the Registration Form
  Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
     Given Click on Registration link
     And Verify the Title
     Then Fill the registration form
     And Submit the Form
     Then Close the browser
     
     
     Examples:
     | emailId        | pwd    |
      | Test@gmail.com | 123456 |
      
     