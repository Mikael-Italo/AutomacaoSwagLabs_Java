$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Realizar Login com Sucesso",
  "description": "",
  "id": "login;realizar-login-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@RealizarLoginComSucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "informar o campo Username como \"\u003cusuario\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "informar o campo Password como \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clicar no botao Login",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "o sistema devera autorizar o login, exibindo a pagina principal do sistema",
  "keyword": "Entao "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login;realizar-login-com-sucesso;",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha"
      ],
      "line": 15,
      "id": "login;realizar-login-com-sucesso;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 16,
      "id": "login;realizar-login-com-sucesso;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 17,
      "id": "login;realizar-login-com-sucesso;;3"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ],
      "line": 18,
      "id": "login;realizar-login-com-sucesso;;4"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2902166700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Realizar Login com Sucesso",
  "description": "",
  "id": "login;realizar-login-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 7,
      "name": "@RealizarLoginComSucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "informar o campo Username como \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "informar o campo Password como \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clicar no botao Login",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "o sistema devera autorizar o login, exibindo a pagina principal do sistema",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 32
    }
  ],
  "location": "LoginSteps.informar_o_campo_Username_como(String)"
});
formatter.result({
  "duration": 2302298500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 32
    }
  ],
  "location": "LoginSteps.informar_o_campo_Password_como(String)"
});
formatter.result({
  "duration": 2111295200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicar_no_botao_Login()"
});
formatter.result({
  "duration": 2156008500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.o_sistema_devera_autorizar_o_login_exibindo_a_pagina_principal_do_sistema()"
});
formatter.result({
  "duration": 2059418000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 908809000,
  "status": "passed"
});
formatter.before({
  "duration": 2014300600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Realizar Login com Sucesso",
  "description": "",
  "id": "login;realizar-login-com-sucesso;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 7,
      "name": "@RealizarLoginComSucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "informar o campo Username como \"problem_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "informar o campo Password como \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clicar no botao Login",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "o sistema devera autorizar o login, exibindo a pagina principal do sistema",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 32
    }
  ],
  "location": "LoginSteps.informar_o_campo_Username_como(String)"
});
formatter.result({
  "duration": 2118984900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 32
    }
  ],
  "location": "LoginSteps.informar_o_campo_Password_como(String)"
});
