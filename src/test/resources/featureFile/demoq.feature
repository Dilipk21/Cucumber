@demo
Feature: 
  To validate the text boxes in demoq webpage application

  Scenario Outline: 
    To validate the all the text boxes in webpage

    Given User have to enter the Demoq Webpage through Chrome Browsers
    When User have to pass"<firstname>","<lastname>","<email>","<mobilenumber>","<country>","<city>","<msg>","<code>" the value to all the textboxes
    Then User have to click Send button
    Examples:
    |firstname|lastname|email|mobilenumber|country|city|msg|code|
    |Dilip|Kumar|selenium123@gmail.com|8428378276|India|Chennai|allDone|kdK|
    |kumar|dilip|selenium21@gmail.com|8148901095|India|Bangalore|fine|dkpF|
    
    
