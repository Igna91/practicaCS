Feature: comprar
    As user
    I want to buy players
    To improve my team

    Scenario: The player is not for sale
        Given a <futboll player> and a <team id>
        When I press the "Comprar jugador" button AND the player is not for sale
        Then I should be able to not buy

    Scenario: The player does not exist
        Given a <futboll player> and a <team id>
        When I press the "Comprar jugador" button AND the player not exist
        Then I should be able to not buy

    Scenario: Not having enough money
        Given a <futboll player> and a <team id>
        When I press the "Comprar jugador" button AND I don't have enough money
        Then I should be able to not buy

    Scenario: Having enough money to buy a football player and the team there
        Given a <futboll player> and a <team id>
        When I press the "Comprar jugador" button AND I have enough money
        Then I should be able to buy my money should be increased

    Scenario: Having enough money to buy a football player but the team not exist
        Given a <futboll player> and a <team id>
        When I press the "Comprar jugador" button AND I have enough money but team not exist
        Then I should be able to not buy