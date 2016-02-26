Feature: comprar
    As user
    I want to buy players
    To improve my team

    Scenario: buy a player but the player has been bought by another
		Given a <idPlayer>, <costPlayer> and <money> team
		When I press the "Comprar jugador" button AND I don't have enough money
		Then should return <status> and money should be <remainingMoney>
    
    Scenario: Buy a player not enough money and the player not exist
		Given a <idPlayer>, <costPlayer> and <money> team
		When I press the "Comprar jugador" button AND I don't have enough money
		Then should return <status> and money should be <remainingMoney>
	
	Scenario: Buy a player not enough money and the player exist
		Given a <idPlayer>, <costPlayer> and <money> team
		When I press the "Comprar jugador" button AND I don't have enough money
		Then should return <status> and money should be <remainingMoney>
		
	Scenario: Buy a player enough money and the player exist
		Given a <idPlayer>, <costPlayer> and <money> team
		When I press the "Comprar jugador" button AND I have enough money
		Then should return <status> and money should be <remainingMoney>
		
	Scenario: Buy a player enough money but player not exist
		Given a <idPlayer>, <costPlayer> and <money> team
		When I press the "Comprar jugador" button AND I have enough money
		Then should return <status> and money should be <remainingMoney>
    
	
