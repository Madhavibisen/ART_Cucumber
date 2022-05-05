#Author: yalaguresh.kulkarni@mindtree.com

#@smoke

Feature: Motor Insure New Policy Enter Details EN flow
  
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
    #And User select the Transportation use
    And User enter the policy date as "<Policy Start Date>"
    
   
  

    
#Examples:
#|NationalID|1035318375|
#|date of birth|18-12-1969|
#|mobile number|508228298|
#|email id|hussain.al-quhaiz@ibm.com|
#|sequence number|484501610|
#|Policy Start Date|21-04-2022|

    
      Examples:
     |NationalID|date of birth|mobile number|email id|sequence number|Policy Start Date|
     |1096136294|12-09-1969|508228298|hussain.al-quhaiz@ibm.com|484501610|21-04-2022|
   
          
