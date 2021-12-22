@tagBooking
Feature: Booking tickets through FlyAway
I want to use this template for my feature file

@tag1
Scenario: Navigate home page
Given user has opened Application
When user opens Home page
Then user should be navigated to home page

@tag2
Scenario: User Performs the Registration
Given user has opened login page
And user opts to register
When user enters details required

@tag3
Scenario: User books the flight
Given user clicks on the book flight
When user is on payment page clicks on complete booking
Then user is able to see the booked flights

Examples:
| email | password |
| user@user.com | user |