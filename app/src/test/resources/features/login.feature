Feature: login
    As user
    I want to log in in the application
    To anybody can´t play with my team

    Scenario: main screen user
        Given a user "user" and password "password"
        When  <password> is empty and <user> is not empty
        Then should let me not access

    Scenario: main screen password
        Given a user "user" and password "password"
        When <password> is not empty and user <user> is empty
        Then should let me not access

    Scenario: user incorrect and password correct
        Given a user "user" and password "password"
        When the <password> is valid and the <user> is invalid
        Then should let me not access

    Scenario: user and password are correct
        Given a user "user" and password "password"
        When the <password> is valid and the <user> is valid
        Then should let me access

    Scenario: user correct and password incorrect
        Given a user "user" and password "password"
        When the <password> is invalid and the <user> is valid
        Then should let me not access