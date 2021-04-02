@Login @Loginsample
Feature: Login Social mediasites
Scenario: Login social media using FB

@Logininsta 
Scenario: Login Instagram using FB
Given we have mobile phone
When we install instagram
And we enter username and password in instagram app
Then we finally see instagram dashboard

@Logintwitter
Scenario: Login twitter using FB

Given we have mobile phone
When we install twitter
And we enter username and password in twitter app
Then we finally see twitter dashboard

@Loginesite
Scenario: Login esite

Given we have opened esite
When we login to see esite dashboard
 |krishna | password|
Then we close the esite

@Loginesitewithheader
Scenario: Login esite using header

Given we have opened esite
When we login to see esite dashboard using header
 |Username | Password|
 |krishna | moneykandan|
 |vinoth | pass|
Then we close the esite

@Loginesitewithheaderusingexamples
Scenario Outline: Login esite using header

Given we have opened esite
When we login to see esite dashboard using header with "<Username>" and "<Password>"
Then we close the esite

Examples:
 |Username | Password|
 |krishna | moneykandan|
 |vinoth | pass|