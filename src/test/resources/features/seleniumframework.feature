Feature: Make a research
  Use selenium java with cucumber-jvm and navigate to website

  Scenario: Search on Google

  When I open Google website
  And I enter some words
  Then I should be able to click on search button
