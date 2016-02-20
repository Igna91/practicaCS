Feature: login
    As user
    I want to log in in the application
    To anybody can´t play with my team
    
    Scenario: main screen user
        Given a <user>
        When the fiel <password> is empty and the field <user> is not empty
        Then should return <access>
        
    Scenario: main screen password
        Given a <password>
        When the fiel <password> is not empty and the field <user> is empty
        Then should return <access>
        
    Scenario: user incorrect and password correct
        Given a <user> and <password>
        When the <password> is valid and the <user> is invalid
        Then should return <access>
    
    Scenario: user and password are correct
        Given a <user> and <password>
        When the <password> is valid and the <user> is valid
        Then should return <access>
        
    Scenario: user correct and password incorrect
        Given a <user> and <password>
        When the <password> is invalid and the <user> is valid
        Then should return <access>
		
	Examples:
    | user 	| password 	| access 	|
    |  "m"	|  			|	-1		|
	| 		|  "m"		|	-1		|
	|  "p"  |  "m"  	|    1  	|
	|  "m"  |  "m"  	|    1  	|
	|  "m"  |  "p"  	|   -1  	|
	
	
	