@e2e
Feature: E2E Test on automationexercise.com
@Register

Scenario: User registration and deletion
  Given Go to home page
  When Click on "Signup / Login" button
  Then Verify "New User Signup!" is visible
  When Enter name and email address
  And Click "Signup" button
  Then Verify that "ENTER ACCOUNT INFORMATION" is visible
  When Fill details: Title, Name, Email, Password, Date of birth
  And Select checkbox Sign up for our newsletter!
  And Select checkbox Receive special offers from our partners!
  And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  And Click Create Account button
  Then Verify  that ACCOUNT CREATED! is visible.
  When Click button Continue
  Then Verify that Logged in as username is visible
  When Click Delete Account button
  Then Verify that ACCOUNT DELETED! is visible
  And  Click Continue button