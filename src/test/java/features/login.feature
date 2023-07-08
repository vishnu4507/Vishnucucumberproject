
Feature: 
  Google Application Demo
  
  Background:
  
Given that I have gone to the Google page


  Scenario Outline: Google Login Should be successfull
    
    When I will add "<keyword>" to the search box
    And click the Search Button
    Then cats should be mentioned in the results
    Then close the browser
   
    @smoke
   Examples:
   
   |keyword|
   |Tiger|
   |Lion|
   |Zebra|
   |Monkey|
 
 
     Scenario: Login for be Dog search 
    
    When I add Dog to the search box
    And click the Search Button
    Then cats should be mentioned in the results
    Then close the browser
    
 
    Scenario: Login for be parrot search
    
    When I add Parrot to the search box
    And click the Search Button
    Then cats should be mentioned in the results
    Then close the browser
 
 
 

 Scenario Outline: Facebook login
 
 Given open the facebook app
 When  user enter the "<username>" and "<password>"
 And  Clik the login button
 Then  Login should be successfull
 Then  close the browser properly
 
 Examples:
 
 |username|password|
 |Monica|moni123|
 |nithya|1212|
 |Nithya1|sdlkjf121|


    
    
    
    
    

   
    