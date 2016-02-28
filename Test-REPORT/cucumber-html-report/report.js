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
  "duration": 93911656,
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
  "duration": 1688622,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 1344934,
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
  "duration": 38134,
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
  "duration": 61600,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 36667,
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
  "location": "comprar.i_press_the_something_button_and_i_dont_have_enough_money(String)"
});
formatter.result({
  "duration": 65511,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 18578,
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
  "duration": 41555,
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
  "duration": 59644,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_buy_my_money_should_be_increased()"
});
formatter.result({
  "duration": 1686667,
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
  "duration": 31778,
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
  "duration": 55245,
  "status": "passed"
});
formatter.match({
  "location": "comprar.i_should_be_able_to_not_buy()"
});
formatter.result({
  "duration": 13200,
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
  "duration": 110489,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_empty_and_user_is_not_empty()"
});
formatter.result({
  "duration": 21022,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 267912,
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
  "duration": 102178,
  "status": "passed"
});
formatter.match({
  "location": "login.password_is_not_empty_and_user_user_is_empty()"
});
formatter.result({
  "duration": 17111,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 177467,
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
  "duration": 94356,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_invalid()"
});
formatter.result({
  "duration": 16134,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 200444,
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
  "duration": 93378,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_valid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 18578,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_access()"
});
formatter.result({
  "duration": 243466,
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
  "duration": 86533,
  "status": "passed"
});
formatter.match({
  "location": "login.the_password_is_invalid_and_the_user_is_valid()"
});
formatter.result({
  "duration": 19067,
  "status": "passed"
});
formatter.match({
  "location": "login.should_let_me_not_access()"
});
formatter.result({
  "duration": 243956,
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
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "duration": 84578,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_has_players()"
});
formatter.result({
  "duration": 27866,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_football_team_return()"
});
formatter.result({
  "duration": 1402133,
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
  "name": "an empty element is returned",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 61111,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_main_team_does_not_have_players()"
});
formatter.result({
  "duration": 22489,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_element_is_returned()"
});
formatter.result({
  "duration": 1750711,
  "status": "failed",
  "error_message": "java.lang.ArrayIndexOutOfBoundsException: -1\r\n\tat java.util.ArrayList.elementData(ArrayList.java:400)\r\n\tat java.util.ArrayList.get(ArrayList.java:413)\r\n\tat junitx.framework.ListAssert.failNotContains(ListAssert.java:131)\r\n\tat junitx.framework.ListAssert.assertContains(ListAssert.java:118)\r\n\tat junitx.framework.ListAssert.assertEquals(ListAssert.java:91)\r\n\tat junitx.framework.ListAssert.assertEquals(ListAssert.java:78)\r\n\tat gradle.cucumber.team_summary.an_empty_element_is_returned(team_summary.java:67)\r\n\tat ✽.Then an empty element is returned(team_summary.feature:14)\r\n"
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
  "duration": 44489,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_has_players()"
});
formatter.result({
  "duration": 16622,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_backup_equipment_will_return()"
});
formatter.result({
  "duration": 44000,
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
  "name": "an empty element is returned",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "team_summary.my_team()"
});
formatter.result({
  "duration": 45956,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_secondary_team_does_not_have_players()"
});
formatter.result({
  "duration": 21022,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.an_empty_element_is_returned()"
});
formatter.result({
  "duration": 182355,
  "status": "failed",
  "error_message": "java.lang.ArrayIndexOutOfBoundsException: -1\r\n\tat java.util.ArrayList.elementData(ArrayList.java:400)\r\n\tat java.util.ArrayList.get(ArrayList.java:413)\r\n\tat junitx.framework.ListAssert.failNotContains(ListAssert.java:131)\r\n\tat junitx.framework.ListAssert.assertContains(ListAssert.java:118)\r\n\tat junitx.framework.ListAssert.assertEquals(ListAssert.java:91)\r\n\tat junitx.framework.ListAssert.assertEquals(ListAssert.java:78)\r\n\tat gradle.cucumber.team_summary.an_empty_element_is_returned(team_summary.java:67)\r\n\tat ✽.Then an empty element is returned(team_summary.feature:24)\r\n"
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
  "duration": 51822,
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
  "duration": 55244,
  "status": "passed"
});
formatter.match({
  "location": "team_summary.my_team_money_will_be_returned()"
});
formatter.result({
  "duration": 39600,
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
  "duration": 95334,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_does_not_belong_to_the_team()"
});
formatter.result({
  "duration": 29823,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 53778,
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
  "duration": 45956,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_but_that_player_does_not_exist()"
});
formatter.result({
  "duration": 23956,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 13689,
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
  "duration": 58177,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_exists_and_belongs_to_the_team()"
});
formatter.result({
  "duration": 19555,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_put_it_on_sale()"
});
formatter.result({
  "duration": 29823,
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
  "duration": 44978,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_is_already_sold()"
});
formatter.result({
  "duration": 18089,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 13689,
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
  "duration": 41066,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_want_to_sell_a_player_and_the_team_to_which_it_belongs_does_not_exist()"
});
formatter.result({
  "duration": 14178,
  "status": "passed"
});
formatter.match({
  "location": "vender.i_can_not_put_it_on_sale()"
});
formatter.result({
  "duration": 12711,
  "status": "passed"
});
});