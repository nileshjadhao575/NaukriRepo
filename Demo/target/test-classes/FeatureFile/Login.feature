Feature: login function

Scenario: test login functionality


Given user login the application
When user enter "<nsjadhao@gmail.com>" and "<12345>"
Then user click login button 
Then close the browser
