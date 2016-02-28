Feature: Team summary
    As player
    I want to see my team players and score
    To keep me updated

    Scenario: not empty principal team
        Given my team
        When My main team has players
        Then my main football team return

    Scenario: empty team principal team
        Given my team
        When My main team does not have players
        Then an empty principal team is returned

    Scenario: not empty reserve team
        Given my team
        When My secondary team has players
        Then my backup equipment will return

    Scenario: empty team reserve team
        Given my team
        When My secondary team does not have players
        Then an empty reserve team is returned

    Scenario: team score
        Given my team
        When I press the "Datos" button
        Then my team money will be returned