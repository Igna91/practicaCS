$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprar.feature");
formatter.feature({
  "id": "comprar",
  "description": "  As user\r\n  I want to buy players\r\n  To improve my team",
  "name": "comprar",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "comprar;the-player-is-not-for-sale",
  "description": "",
  "name": "The player is not for sale",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press the \"Comprar jugador\" button AND the player is not for sale",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should be able to not buy",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 91153834,
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
  "duration": 1846533,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 1404578,
  "status": "passed"
});
formatter.scenario({
  "id": "comprar;the-player-does-not-exist",
  "description": "",
  "name": "The player does not exist",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "I press the \"Comprar jugador\" button AND the player not exist",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "I should be able to not buy",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 31777,
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
  "duration": 56711,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 17111,
  "status": "passed"
});
formatter.scenario({
  "id": "comprar;not-having-enough-money",
  "description": "",
  "name": "Not having enough money",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "I press the \"Comprar jugador\" button AND I don\u0027t have enough money",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "I should be able to not buy",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 33734,
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
  "duration": 53289,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 12222,
  "status": "passed"
});
formatter.scenario({
  "id": "comprar;having-enough-money-to-buy-a-football-player-and-the-team-there",
  "description": "",
  "name": "Having enough money to buy a football player and the team there",
  "keyword": "Scenario",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "I press the \"Comprar jugador\" button AND I have enough money",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "I should be able to buy my money should be increased",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 35689,
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
  "duration": 56223,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_buy_my_money_should_be_increased()"
});
formatter.result({
  "duration": 1582045,
  "status": "passed"
});
formatter.scenario({
  "id": "comprar;having-enough-money-to-buy-a-football-player-but-the-team-not-exist",
  "description": "",
  "name": "Having enough money to buy a football player but the team not exist",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "a \u003cfutboll player\u003e and a \u003cteam id\u003e",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "I press the \"Comprar jugador\" button AND I have enough money but team not exist",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "I should be able to not buy",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "location": "comprar.a_futboll_player_and_a_team_id()"
});
formatter.result({
  "duration": 36667,
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
  "duration": 59645,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 16133,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "id": "login",
  "description": "  As user\r\n  I want to log in in the application\r\n  To anybody can´t play with my team",
  "name": "login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login;main-screen-user",
  "description": "",
  "name": "main screen user",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "\u003cpassword\u003e is empty and \u003cuser\u003e is not empty",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "should let me not access",
  "keyword": "Then ",
  "line": 9
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
  "duration": 113422,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_empty_and_user_is_not_empty()"
});
formatter.result({
  "duration": 13688,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 277200,
  "status": "passed"
});
formatter.scenario({
  "id": "login;main-screen-password",
  "description": "",
  "name": "main screen password",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "\u003cpassword\u003e is not empty and user \u003cuser\u003e is empty",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "should let me not access",
  "keyword": "Then ",
  "line": 14
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
  "duration": 85556,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_not_empty_and_user_user_is_empty()"
});
formatter.result({
  "duration": 16622,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 176978,
  "status": "passed"
});
formatter.scenario({
  "id": "login;user-incorrect-and-password-correct",
  "description": "",
  "name": "user incorrect and password correct",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is invalid",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "should let me not access",
  "keyword": "Then ",
  "line": 19
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
  "duration": 86534,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_invalid()"
});
formatter.result({
  "duration": 15645,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 201911,
  "status": "passed"
});
formatter.scenario({
  "id": "login;user-and-password-are-correct",
  "description": "",
  "name": "user and password are correct",
  "keyword": "Scenario",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is valid",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "should let me access",
  "keyword": "Then ",
  "line": 24
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
  "duration": 81155,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 15156,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_access()"
});
formatter.result({
  "duration": 238578,
  "status": "passed"
});
formatter.scenario({
  "id": "login;user-correct-and-password-incorrect",
  "description": "",
  "name": "user correct and password incorrect",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "the \u003cpassword\u003e is invalid and the \u003cuser\u003e is valid",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "should let me not access",
  "keyword": "Then ",
  "line": 29
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
  "duration": 90933,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_invalid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 18577,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 218044,
  "status": "passed"
});
formatter.uri("menu.feature");
formatter.feature({
  "id": "menu",
  "description": "  As player\r\n  I want to see the app menu\r\n  To navigate",
  "name": "menu",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "menu;see-the-team",
  "description": "",
  "name": "See the team",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "the app menu",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press the \"Equipo\" button",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I can see the \"Equipo\" screen",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "menu.the_app_menu()"
});
formatter.result({
  "duration": 46445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Equipo",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 105600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Equipo",
      "offset": 15
    }
  ],
  "location": "menu.i_can_see_the_screen(String)"
});
formatter.result({
  "duration": 404800,
  "status": "failed",
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat gradle.cucumber.menu.i_can_see_the_screen(menu.java:34)\r\n\tat ✽.Then I can see the \"Equipo\" screen(menu.feature:9)\r\n"
});
formatter.scenario({
  "id": "menu;see-calendario",
  "description": "",
  "name": "See calendario",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "the app menu",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "I press the \"Calendario\" button",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "I can see the \"Calendario\" screen",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "menu.the_app_menu()"
});
formatter.result({
  "duration": 20044,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Calendario",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 68444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Calendario",
      "offset": 15
    }
  ],
  "location": "menu.i_can_see_the_screen(String)"
});
formatter.result({
  "duration": 135911,
  "status": "failed",
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat gradle.cucumber.menu.i_can_see_the_screen(menu.java:34)\r\n\tat ✽.Then I can see the \"Calendario\" screen(menu.feature:14)\r\n"
});
formatter.scenario({
  "id": "menu;see-clasificacion",
  "description": "",
  "name": "See clasificacion",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "the app menu",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "I press the \"Clasificacion\" button",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "I can see the \"Clasificacion\" screen",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "menu.the_app_menu()"
});
formatter.result({
  "duration": 22977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clasificacion",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 71867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clasificacion",
      "offset": 15
    }
  ],
  "location": "menu.i_can_see_the_screen(String)"
});
formatter.result({
  "duration": 156933,
  "status": "failed",
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat gradle.cucumber.menu.i_can_see_the_screen(menu.java:34)\r\n\tat ✽.Then I can see the \"Clasificacion\" screen(menu.feature:19)\r\n"
});
formatter.scenario({
  "id": "menu;see-fichajes",
  "description": "",
  "name": "See fichajes",
  "keyword": "Scenario",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "the app menu",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "I press the \"Fichajes\" button",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "I can see the Fichajes screen",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "menu.the_app_menu()"
});
formatter.result({
  "duration": 20044,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fichajes",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 65022,
  "status": "passed"
});
formatter.match({
  "location": "menu.i_can_see_the_Fichajes_screen()"
});
formatter.result({
  "duration": 109022,
  "status": "failed",
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat gradle.cucumber.menu.i_can_see_the_Fichajes_screen(menu.java:39)\r\n\tat ✽.Then I can see the Fichajes screen(menu.feature:24)\r\n"
});
formatter.scenario({
  "id": "menu;share",
  "description": "",
  "name": "Share",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "the app menu",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "I press the \"Comparte en Twitter\" button",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "I can share my score",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "location": "menu.the_app_menu()"
});
formatter.result({
  "duration": 24933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comparte en Twitter",
      "offset": 13
    }
  ],
  "location": "team_summary.i_press_the_something_button(String)"
});
formatter.result({
  "duration": 67467,
  "status": "passed"
});
formatter.match({
  "location": "menu.i_can_share_my_score()"
});
formatter.result({
  "duration": 119289,
  "status": "failed",
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat gradle.cucumber.menu.i_can_share_my_score(menu.java:44)\r\n\tat ✽.Then I can share my score(menu.feature:29)\r\n"
});
formatter.uri("team_summary.feature");
formatter.feature({
  "id": "team-summary",
  "description": "  As player\r\n  I want to see my team players and score\r\n  To keep me updated",
  "name": "Team summary",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "team-summary;not-empty-principal-team",
  "description": "",
  "name": "not empty principal team",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "my team",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "My main team has players",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "my main football team return",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 112445,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_has_players()"
});
formatter.result({
  "duration": 402844,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_football_team_return()"
});
formatter.result({
  "duration": 174044,
  "status": "passed"
});
formatter.scenario({
  "id": "team-summary;empty-team-principal-team",
  "description": "",
  "name": "empty team principal team",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "my team",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "My main team does not have players",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "an empty principal team is returned",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 43511,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_does_not_have_players()"
});
formatter.result({
  "duration": 83600,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_principal_team_is_returned()"
});
formatter.result({
  "duration": 157912,
  "status": "passed"
});
formatter.scenario({
  "id": "team-summary;not-empty-reserve-team",
  "description": "",
  "name": "not empty reserve team",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "my team",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "My secondary team has players",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "my backup equipment will return",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 44978,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_has_players()"
});
formatter.result({
  "duration": 104133,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_backup_equipment_will_return()"
});
formatter.result({
  "duration": 183334,
  "status": "passed"
});
formatter.scenario({
  "id": "team-summary;empty-team-reserve-team",
  "description": "",
  "name": "empty team reserve team",
  "keyword": "Scenario",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "my team",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "My secondary team does not have players",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "an empty reserve team is returned",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 44978,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_does_not_have_players()"
});
formatter.result({
  "duration": 82622,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_reserve_team_is_returned()"
});
formatter.result({
  "duration": 163778,
  "status": "passed"
});
formatter.scenario({
  "id": "team-summary;team-score",
  "description": "",
  "name": "team score",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "my team",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "I press the \"Datos\" button",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "my team money will be returned",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 38622,
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
  "duration": 57689,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_team_money_will_be_returned()"
});
formatter.result({
  "duration": 49867,
  "status": "passed"
});
formatter.uri("vender.feature");
formatter.feature({
  "id": "vender",
  "description": "  As user\r\n  I want to sell players\r\n  To earn money",
  "name": "vender",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "vender;sell-a-player-and-that-player-does-not-belong-to-the-team",
  "description": "",
  "name": "Sell a player and that player does not belong to the team",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "a team and Player",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I want to sell a player but does not belong to the team",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I can not put it on sale",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 71378,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_does_not_belong_to_the_team()"
});
formatter.result({
  "duration": 19066,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 42044,
  "status": "passed"
});
formatter.scenario({
  "id": "vender;sell-a-player-and-that-player-not-exist",
  "description": "",
  "name": "Sell a player and that player not exist",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "a team and Player",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "I want to sell a player, but that player does not exist",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "I can not put it on sale",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 36178,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_that_player_does_not_exist()"
});
formatter.result({
  "duration": 28845,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 12223,
  "status": "passed"
});
formatter.scenario({
  "id": "vender;sell-a-player-and-that-player-does-belong-to-the-team",
  "description": "",
  "name": "Sell a player and that player does belong to the team",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "a team and Player",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "I want to sell a player and exists and belongs to the team",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "I can put it on sale",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 40089,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_exists_and_belongs_to_the_team()"
});
formatter.result({
  "duration": 15645,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_put_it_on_sale()"
});
formatter.result({
  "duration": 21511,
  "status": "passed"
});
formatter.scenario({
  "id": "vender;sell-a-player-and-the-player-is-already-on-sale",
  "description": "",
  "name": "Sell a player and the player is already on sale",
  "keyword": "Scenario",
  "line": 21,
  "type": "scenario"
});
formatter.step({
  "name": "a team and Player",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "I want to sell a player and is already sold",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "I can not put it on sale",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 39600,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_is_already_sold()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 16622,
  "status": "passed"
});
formatter.scenario({
  "id": "vender;sell-a-player-and-the-team-to-which-it-belongs-does-not-exist",
  "description": "",
  "name": "Sell a player and the team to which it belongs does not exist",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "a team and Player",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "I want to sell a player and the team to which it belongs does not exist",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "I can not put it on sale",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "location": "vender.a_team_and_player()"
});
formatter.result({
  "duration": 42533,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_the_team_to_which_it_belongs_does_not_exist()"
});
formatter.result({
  "duration": 13689,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 12223,
  "status": "passed"
});
});