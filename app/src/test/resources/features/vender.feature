Feature: vender
    As user
    I want to sell players
    To earn money

    Scenario: Sell a player and that player does not belong to the team
        Given a team and Player
        When I want to sell a player but does not belong to the team
        Then I can not put it on sale

    Scenario: Sell a player and that player not exist
        Given a team and Player
        When I want to sell a player, but that player does not exist
        Then I can not put it on sale

    Scenario: Sell a player and that player does belong to the team
        Given a team and Player
        When I want to sell a player and exists and belongs to the team
        Then I can put it on sale

    Scenario: Sell a player and the player is already on sale
        Given a team and Player
        When I want to sell a player and is already sold
        Then I can not put it on sale

    Scenario: Sell a player and the team to which it belongs does not exist
        Given a team and Player
        When I want to sell a player and the team to which it belongs does not exist
        Then I can not put it on sale