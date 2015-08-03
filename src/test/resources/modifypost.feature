Feature: Modifying a Post

Scenario: Valid Modification
	Given User enters correct data
	When User clicks "Submit"
	Then System should show a message saying "Post successfully modified"

Scenario: Invalid User
	Given User modifies a post they don't own
	When User clicks "Submit"
	Then System should show a message saying "Invalid User"

Scenario: Invalid Modification
	Given User enters Destination "Indira Nagar" Source "Domlur" StartTime "as" EndTime "18:30"
	When User clicks "Submit"
	Then System should show a message saying "StartTime invalid"
	
Scenario: Invalid Modification
	Given User enters Destination "" Source "Domlur" StartTime "17:30" EndTime "18:30"
	When User clicks "Submit"
	Then System should show a message saying "Destination cannot be blank"	
	
Scenario: Invalid Modification
	Given User enters Destination "Indira Nagar" Source "" StartTime "17:30" EndTime "18:30"
	When User clicks "Submit"
	Then System should show a message saying "Source cannot be blank"	

Scenario: Valid User
	Given User modifies a post they own
	When User clicks "Submit"
	Then System should show a message saying "Post successfully modified"