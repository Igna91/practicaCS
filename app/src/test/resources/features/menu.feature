Feature: menu
    As player
    I want to see the app menu
    To navigate

    Scenario: See the team
		Given the app menu
		When I press the "Equipo" button
		Then I can see the "Equipo" screen

    Scenario: See calendario
		Given the app menu
		When I press the "Calendario" button
		Then I can see the "Calendario" screen

    Scenario: See clasificacion
		Given the app menu
		When I press the "Clasificacion" button
		Then I can see the "Clasificacion" screen

    Scenario: See fichajes
		Given the app menu
		When I press the "Fichajes" button
		Then I can see the Fichajes screen

    Scenario: Share
		Given the app menu
		When I press the "Comparte en Twitter" button
		Then I can share my score