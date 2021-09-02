Feature: Make My Trip Login Test

@Login
Scenario: Login to Make My Trip

Given user opens browser
Then Click on Login or Create Account
Then Enter Email id or Mobile number
Then Click on continue
#Enter OTP Manually
Then Wait for 30 Secs
Then Click on Login button