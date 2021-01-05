Feature: HealthCare Management System

@as
Scenario Outline: to validate whether user is able to login as patient successfully
Given User is on Login page
When user enters valid username "<username>" and password "<pass>"
And clicks on login button
Then User should be able to login as patient successfully with title "Accountant Dashboard - Hospital Management System"
Examples:
|username|pass|
|Lakshmi@gmail.com|123456|
|Lakshmi@gmail.com|12346|

@qwe
Scenario: to verify if order is placed
Given select the payment type "<mode>" 
Then order placed successfully
|mode|discount|
|credit card|10%|
|debit card|5%|
|cod|0%|
