Feature: login
    As user
    I want to log in in the application
    To anybody can´t play with my team
    
    Scenario Outline: main screen user
        Given a user "user" and password "password"
        When  <password> is empty and <user> is not empty
        Then should return "access"
	Examples:
		| 	user 	|	password	|	access	|
		|	 "m"	| 	""			|	false	|
		|	""		|	"m"			|	false	|
		|	"m"		|	"m"			|	true	|
        
    Scenario: main screen password
        Given a user "user" and password "password"
        When <password> is not empty and user <user> is empty
        Then should return <access>
        
    Scenario: user incorrect and password correct
        Given a user "user" and password "password"
        When the <password> is valid and the <user> is invalid
        Then should return <access>
    
    Scenario: user and password are correct
        Given a user "user" and password "password"
        When the <password> is valid and the <user> is valid
        Then should return <access>
        
    Scenario: user correct and password incorrect
        Given a user "user" and password "password"
        When the <password> is invalid and the <user> is valid
        Then should return <access>
		
	
	
	