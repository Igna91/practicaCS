Feature: vender
    As user
    I want to sell players
    To earn money

    Scenario: Sell a player and that player does not belong to the team
	Given a <team> and <idPlayer>
	When I press the "Vender jugador" button
	Then it will not appear on <mercado>
	
	Scenario: Sell a player and that player not exist
	Given a <team> and <idPlayer>
	When I press the "Vender jugador" button
	Then it will not appear on <mercado>
	
	Scenario: Sell a player and that player does belong to the team
	Given a <team> and <idPlayer>
	When I press the "Vender jugador" button
	Then it will appear on <mercado>

    Scenario: Sell a player and the player is already on sale
	Given a <team> and <idPlayer>
	When I press the "Vender jugador" button
	Then it will not appear on <mercado>

    Scenario: See players to sell
	Given the menu
	When I press the "Resumen de equipo" button
	Then I can see the <mercado>

    