Feature: Reservation process

Scenario: One way ticket reservation
	When I open main page
	And I click link sign-on
	And I login as "adam_qwe" "qwe123"
	And I choose on-way radio
	And I choose "2" passengers
	And I choose "Paris" from port
	And I choose "July" from month
	And I choose "20" from day
	And I choose "London" to port 
	And I choose "July" to month
	And I choose "20" to day 
	Then form should be filled with date above