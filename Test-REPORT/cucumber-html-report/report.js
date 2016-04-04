$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprar.feature");
formatter.feature({
  "line": 1,
  "name": "comprar",
  "description": "  As user\r\n  I want to buy players\r\n  To improve my team",
  "id": "comprar",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "The player is not for sale",
  "description": "",
  "id": "comprar;the-player-is-not-for-sale",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I press the \"Comprar jugador\" button AND the player is not for sale",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be able to not buy",
  "keyword": "Then "
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 51122802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar jugador",
      "offset": 13
    }
  ],
  "location": "comprar.i_press_the_something_button_and_the_player_is_not_for_sale(String)"
});
formatter.result({
  "duration": 1123609,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 868229,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "The player does not exist",
  "description": "",
  "id": "comprar;the-player-does-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I press the \"Comprar jugador\" button AND the player not exist",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be able to not buy",
  "keyword": "Then "
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 21722,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar jugador",
      "offset": 13
    }
  ],
  "location": "comprar.i_press_the_something_button_and_the_player_not_exist(String)"
});
formatter.result({
  "duration": 34133,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 9619,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Not having enough money",
  "description": "",
  "id": "comprar;not-having-enough-money",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I press the \"Comprar jugador\" button AND I don\u0027t have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should be able to not buy",
  "keyword": "Then "
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 22031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar jugador",
      "offset": 13
    }
  ],
  "location": "comprar.i_press_the_something_button_and_i_dont_have_enough_money(String)"
});
formatter.result({
  "duration": 30721,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 11171,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Having enough money to buy a football player and the team there",
  "description": "",
  "id": "comprar;having-enough-money-to-buy-a-football-player-and-the-team-there",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I press the \"Comprar jugador\" button AND I have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should be able to buy my money should be increased",
  "keyword": "Then "
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 23583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar jugador",
      "offset": 13
    }
  ],
  "location": "comprar.i_press_the_something_button_and_i_have_enough_money(String)"
});
formatter.result({
  "duration": 46545,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_buy_my_money_should_be_increased()"
});
formatter.result({
  "duration": 839681,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Having enough money to buy a football player but the team not exist",
  "description": "",
  "id": "comprar;having-enough-money-to-buy-a-football-player-but-the-team-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Comprar jugador\" button AND I have enough money but team not exist",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should be able to not buy",
  "keyword": "Then "
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 23273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar jugador",
      "offset": 13
    }
  ],
  "location": "comprar.i_press_the_button_AND_I_have_enough_money_but_team_not_exist(String)"
});
formatter.result({
  "duration": 32271,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 10861,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "  As user\r\n  I want to log in in the application\r\n  To anybody can´t play with my team",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "main screen user",
  "description": "",
  "id": "login;main-screen-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "\u003cpassword\u003e is empty and \u003cuser\u003e is not empty",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should let me not access",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "login.a_user_and_password(String,String)"
});
formatter.result({
  "duration": 63302,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_empty_and_user_is_not_empty()"
});
formatter.result({
  "duration": 13343,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 109848,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "main screen password",
  "description": "",
  "id": "login;main-screen-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "\u003cpassword\u003e is not empty and user \u003cuser\u003e is empty",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "should let me not access",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "login.a_user_and_password(String,String)"
});
formatter.result({
  "duration": 39098,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_not_empty_and_user_user_is_empty()"
});
formatter.result({
  "duration": 12102,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 48718,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user incorrect and password correct",
  "description": "",
  "id": "login;user-incorrect-and-password-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is invalid",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "should let me not access",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "login.a_user_and_password(String,String)"
});
formatter.result({
  "duration": 39409,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_invalid()"
});
formatter.result({
  "duration": 15205,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 37237,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "user and password are correct",
  "description": "",
  "id": "login;user-and-password-are-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is valid",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "should let me access",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "login.a_user_and_password(String,String)"
});
formatter.result({
  "duration": 39719,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 11792,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_access()"
});
formatter.result({
  "duration": 48097,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "user correct and password incorrect",
  "description": "",
  "id": "login;user-correct-and-password-incorrect",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the \u003cpassword\u003e is invalid and the \u003cuser\u003e is valid",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "should let me not access",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "login.a_user_and_password(String,String)"
});
formatter.result({
  "duration": 39719,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_invalid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 13653,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 40340,
  "status": "passed"
});
formatter.uri("team_summary.feature");
formatter.feature({
  "line": 1,
  "name": "Team summary",
  "description": "  As player\r\n  I want to see my team players and score\r\n  To keep me updated",
  "id": "team-summary",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "not empty principal team",
  "description": "",
  "id": "team-summary;not-empty-principal-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "my team",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "My main team has players",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "my main football team return",
  "keyword": "Then "
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 66094,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_has_players()"
});
formatter.result({
  "duration": 18928,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_football_team_return()"
});
formatter.result({
  "duration": 315889,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "empty team principal team",
  "description": "",
  "id": "team-summary;empty-team-principal-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "my team",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "My main team does not have players",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "an empty principal team is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 25755,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_does_not_have_players()"
});
formatter.result({
  "duration": 20480,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_principal_team_is_returned()"
});
formatter.result({
  "duration": 88747,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "not empty reserve team",
  "description": "",
  "id": "team-summary;not-empty-reserve-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "my team",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "My secondary team has players",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "my backup equipment will return",
  "keyword": "Then "
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 24514,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_has_players()"
});
formatter.result({
  "duration": 15515,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_backup_equipment_will_return()"
});
formatter.result({
  "duration": 93401,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "empty team reserve team",
  "description": "",
  "id": "team-summary;empty-team-reserve-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "my team",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "My secondary team does not have players",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "an empty reserve team is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 24203,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_does_not_have_players()"
});
formatter.result({
  "duration": 15205,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_reserve_team_is_returned()"
});
formatter.result({
  "duration": 130017,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "team score",
  "description": "",
  "id": "team-summary;team-score",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "my team",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Datos\" button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "my team money will be returned",
  "keyword": "Then "
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 31341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Datos",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 43753,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_team_money_will_be_returned()"
});
formatter.result({
  "duration": 37857,
  "status": "passed"
});
formatter.uri("vender.feature");
formatter.feature({
  "line": 1,
  "name": "vender",
  "description": "  As user\r\n  I want to sell players\r\n  To earn money",
  "id": "vender",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Sell a player and that player does not belong to the team",
  "description": "",
  "id": "vender;sell-a-player-and-that-player-does-not-belong-to-the-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a team and Player",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I want to sell a player but does not belong to the team",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can not put it on sale",
  "keyword": "Then "
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 50269,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_does_not_belong_to_the_team()"
});
formatter.result({
  "duration": 22962,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 34444,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Sell a player and that player not exist",
  "description": "",
  "id": "vender;sell-a-player-and-that-player-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "a team and Player",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I want to sell a player, but that player does not exist",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I can not put it on sale",
  "keyword": "Then "
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 22962,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_that_player_does_not_exist()"
});
formatter.result({
  "duration": 15515,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 11171,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Sell a player and that player does belong to the team",
  "description": "",
  "id": "vender;sell-a-player-and-that-player-does-belong-to-the-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "a team and Player",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I want to sell a player and exists and belongs to the team",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I can put it on sale",
  "keyword": "Then "
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 23893,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_exists_and_belongs_to_the_team()"
});
formatter.result({
  "duration": 12102,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_put_it_on_sale()"
});
formatter.result({
  "duration": 18308,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Sell a player and the player is already on sale",
  "description": "",
  "id": "vender;sell-a-player-and-the-player-is-already-on-sale",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "a team and Player",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I want to sell a player and is already sold",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I can not put it on sale",
  "keyword": "Then "
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 25444,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_is_already_sold()"
});
formatter.result({
  "duration": 12101,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 10240,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Sell a player and the team to which it belongs does not exist",
  "description": "",
  "id": "vender;sell-a-player-and-the-team-to-which-it-belongs-does-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "a team and Player",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I want to sell a player and the team to which it belongs does not exist",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I can not put it on sale",
  "keyword": "Then "
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 23583,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_the_team_to_which_it_belongs_does_not_exist()"
});
formatter.result({
  "duration": 12412,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 10550,
  "status": "passed"
});
});