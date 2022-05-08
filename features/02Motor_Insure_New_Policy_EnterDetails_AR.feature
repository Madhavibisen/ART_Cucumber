#Author: yalaguresh.kulkarni@mindtree.com

#@mustRun 

Feature: Motor Insure New Policy Enter Details AR flow
 
@smoke @regression
Scenario Outline: Motor Insure New Policy Enter Details AR flow
    
    Given getting Browser from the previous page.
    When URL is hitted
    And user clicks on the Aabic language hyperlink
    Then user clicks on the motor product
    And user navigates the to Insure New Policy pages
    Then user navigates to the Insure New Policy
    Then user start entering the policies holder details.
    And user enters National ID as "<NationalID>"
    Then user enters date of birth as "<date of birth>"
    Then user enters mobile number as "<mobile number>"
    And user enters email ID as "<email id>"
    And user enters sequence number as "<sequence number>"
    And user enters the policy date as "<Policy Start Date>"
    

      Examples:
     |NationalID|date of birth|mobile number|email id|sequence number|Policy Start Date|
     |2328803271|27-05-1988|508228298|hussain.al-quhaiz@ibm.com|25954010|21-04-2022|
   
          
