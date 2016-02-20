Feature: comprar
    As user
    I want to buy players
    To improve my team
    
    Scenario: Buy a player
	Given a Player
	When I press the "Comprar jugador" button
	Then it will appear on my team

    Scenario: Buy a player (enough money)
	Given a Player
	When I press the "Comprar jugador" button
	Then my money should be reduced
   
    Scenario: See the players to buy
	Given the menu 
	When I press the "Fichajes" button
	Then I can see the players to buy

    Scenario: See the players to buy (empty market)
	Given the menu
	When I press the "Fichajes" button AND there are no players to buy
	Then I cant see any player to buy
    
    Scenario: Buy a player (not enough money)
	Given a Player
	When I press the "Comprar jugador" button AND I don't have enough money
	Then I can see an error message AND the player wont appear on my team

    
	