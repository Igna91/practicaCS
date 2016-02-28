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
  "name": "buy a player but the player has been bought by another",
  "description": "",
  "id": "comprar;buy-a-player-but-the-player-has-been-bought-by-another",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a \u003cidPlayer\u003e, \u003ccostPlayer\u003e and \u003cmoney\u003e team",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I press the \"Comprar jugador\" button AND I don\u0027t have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should return \u003cstatus\u003e and money should be \u003cremainingMoney\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "Buy a player not enough money and the player not exist",
  "description": "",
  "id": "comprar;buy-a-player-not-enough-money-and-the-player-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "a \u003cidPlayer\u003e, \u003ccostPlayer\u003e and \u003cmoney\u003e team",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I press the \"Comprar jugador\" button AND I don\u0027t have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "should return \u003cstatus\u003e and money should be \u003cremainingMoney\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Buy a player not enough money and the player exist",
  "description": "",
  "id": "comprar;buy-a-player-not-enough-money-and-the-player-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "a \u003cidPlayer\u003e, \u003ccostPlayer\u003e and \u003cmoney\u003e team",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I press the \"Comprar jugador\" button AND I don\u0027t have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "should return \u003cstatus\u003e and money should be \u003cremainingMoney\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "Buy a player enough money and the player exist",
  "description": "",
  "id": "comprar;buy-a-player-enough-money-and-the-player-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "a \u003cidPlayer\u003e, \u003ccostPlayer\u003e and \u003cmoney\u003e team",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I press the \"Comprar jugador\" button AND I have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "should return \u003cstatus\u003e and money should be \u003cremainingMoney\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "Buy a player enough money but player not exist",
  "description": "",
  "id": "comprar;buy-a-player-enough-money-but-player-not-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "a \u003cidPlayer\u003e, \u003ccostPlayer\u003e and \u003cmoney\u003e team",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Comprar jugador\" button AND I have enough money",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "should return \u003cstatus\u003e and money should be \u003cremainingMoney\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "login",
  "description": "Para loguearse\r\nComo usuario\r\nQuiero introducir mi usuario y contraseña",
  "id": "login",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 7,
  "name": "introducir bien la contraseña y mal el usuario",
  "description": "",
  "id": "login;introducir-bien-la-contraseña-y-mal-el-usuario",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 8,
  "name": "que he introducido el usuario \u003centrada_1\u003e en el login",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "que  he introducido la contraseña \u003centrada_2\u003e en el login",
  "keyword": "Y "
});
formatter.step({
  "line": 10,
  "name": "oprimo el \u003cboton\u003e",
  "keyword": "Cuando "
});
formatter.step({
  "line": 11,
  "name": "el resultado debe ser \u003cresultado\u003e en la pantalla",
  "rows": [
    {
      "cells": [
        "entrada_1",
        "entrada_2"
      ],
      "line": 12
    },
    {
      "cells": [
        "m",
        "m"
      ],
      "line": 13
    }
  ],
  "keyword": "Entonces "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("login2.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "  As user\r\n  I want to log in in the application\r\n  To anybody can´t play with my team",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "main screen user",
  "description": "",
  "id": "login;main-screen-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
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
  "name": "should return \"access\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login;main-screen-user;",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "access"
      ],
      "line": 11,
      "id": "login;main-screen-user;;1"
    },
    {
      "cells": [
        "\"m\"",
        "\"\"",
        "false"
      ],
      "line": 12,
      "id": "login;main-screen-user;;2"
    },
    {
      "cells": [
        "\"\"",
        "\"m\"",
        "false"
      ],
      "line": 13,
      "id": "login;main-screen-user;;3"
    },
    {
      "cells": [
        "\"m\"",
        "\"m\"",
        "true"
      ],
      "line": 14,
      "id": "login;main-screen-user;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "main screen user",
  "description": "",
  "id": "login;main-screen-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "\"\" is empty and \"m\" is not empty",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should return \"access\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "main screen user",
  "description": "",
  "id": "login;main-screen-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "\"m\" is empty and \"\" is not empty",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should return \"access\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "main screen user",
  "description": "",
  "id": "login;main-screen-user;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "\"m\" is empty and \"m\" is not empty",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should return \"access\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "main screen password",
  "description": "",
  "id": "login;main-screen-password",
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
  "name": "\u003cpassword\u003e is not empty and user \u003cuser\u003e is empty",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "should return \u003caccess\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "user incorrect and password correct",
  "description": "",
  "id": "login;user-incorrect-and-password-correct",
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
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is invalid",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "should return \u003caccess\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "user and password are correct",
  "description": "",
  "id": "login;user-and-password-are-correct",
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
  "name": "the \u003cpassword\u003e is valid and the \u003cuser\u003e is valid",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "should return \u003caccess\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 31,
  "name": "user correct and password incorrect",
  "description": "",
  "id": "login;user-correct-and-password-incorrect",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "a user \"user\" and password \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "the \u003cpassword\u003e is invalid and the \u003cuser\u003e is valid",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "should return \u003caccess\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("menu.feature");
formatter.feature({
  "line": 1,
  "name": "menu",
  "description": "  As player\r\n  I want to see the app menu\r\n  To navigate",
  "id": "menu",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "See the team",
  "description": "",
  "id": "menu;see-the-team",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the app menu",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I press the \"Equipo\" button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can see the \"Equipo\" screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "See calendario",
  "description": "",
  "id": "menu;see-calendario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "the app menu",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I press the \"Calendario\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I can see the \"Calendario\" screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "See clasificacion",
  "description": "",
  "id": "menu;see-clasificacion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "the app menu",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I press the \"Clasificacion\" button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I can see the \"Clasificacion\" screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "See fichajes",
  "description": "",
  "id": "menu;see-fichajes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "the app menu",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I press the \"Fichajes\" button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I can see the Fichajes screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "Share",
  "description": "",
  "id": "menu;share",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "the app menu",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Comparte en Twitter\" button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I can share my score",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "my user team",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I press the \"Alineacion\" button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I could see my principal team on screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "my empty user team",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I presss the \"Alineacion\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I could see nothing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "my user team",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I press the \"Reservas\" button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I could see my reserve team on screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "my empty user team",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I presss the \"Reservas\" button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I could see nothing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "my user team",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Datos\" button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I could see my score and money",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "a \u003cteam\u003e and \u003cidPlayer\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I press the \"Vender jugador\" button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "it will not appear on \u003cmercado\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "a \u003cteam\u003e and \u003cidPlayer\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I press the \"Vender jugador\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "it will not appear on \u003cmercado\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "a \u003cteam\u003e and \u003cidPlayer\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I press the \"Vender jugador\" button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "it will appear on \u003cmercado\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "a \u003cteam\u003e and \u003cidPlayer\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I press the \"Vender jugador\" button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "it will not appear on \u003cmercado\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "See players to sell",
  "description": "",
  "id": "vender;see-players-to-sell",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "the menu",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I press the \"Resumen de equipo\" button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I can see the \u003cmercado\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});