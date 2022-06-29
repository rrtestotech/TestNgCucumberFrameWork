Feature: view my details feature

Scenario: verify user able to edit personal details
Given user is on login page
When user enter username "Admin"
And user enter password "admin123"
And user click on login button
When user click on myinfo tab
#personal details lable validation
Then user should able to see personal details
And user click on edit button
When user modifies full name as "rekha" "a" "d"
And user modifies personaldetails as "22-02-2019" "male" "Married" "Indian"
When user click on save button
Then user should able to see message as "Successfully Saved"