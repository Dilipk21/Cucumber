@login
Feature: To validate Login Functionality of Facebook application

  Background: 
    Given User have to enter facebook application through chrome browser

  @invaliduid
  Scenario: To validate Login by using invalid username and valid password
    When User have to enter invalid username and valid password
      | username | Dilip              |
      | email    | dilip123@gmail.com |
      | pswd     | dilip123           |
    And User have to click the login button
    Then User should be in a invalid credential page

  @validuid
  Scenario: To validate Login by using valid username and invalid password
    When User have to enter valid username and invalid password
      | username | email               | pswd       |
      | dilip    | dilip2124@gmail.com | dilip2124  |
      | kumar    | kumar2421@gmail.com | kumar2124  |
      | dilipk   | dilipk123@gmail.com | dilipk2410 |
    And User have to click the login button
    Then User should be in a invalid credential page
