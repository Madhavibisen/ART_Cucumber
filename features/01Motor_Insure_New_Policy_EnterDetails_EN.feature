#Author: yalaguresh.kulkarni@mindtree.com



Feature: Motor Insure New Policy Enter Details EN flow
 
@smoke @regression
Scenario Outline: Motor Insure New Policy Enter Details EN flow
    
    Given Browser is open
    When  User in home page
    Then  User click on the motor option
    And  User navigate to Insure New Policy page
    Then  User navigate to Insure New Policy
    Then  User enters the policies holder details.
    And  User enter NID as "<NationalID>"
    Then  User enter dob as "<date of birth>"
    Then  User enter mobile as "<mobile number>"
    And  User enter email as "<email id>"
    And User enter sequence as "<sequence number>"
    #And User select the Transportation uses
    And User enter the policy date as "<Policy Start Date>"
    

    
      Examples:
     |NationalID|date of birth|mobile number|email id|sequence number|Policy Start Date|
     |2328803271|27-05-1988|508228298|hussain.al-quhaiz@ibm.com|25954010|21-04-2022|
   
          
