$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Firstfeature.feature");
formatter.feature({
  "line": 2,
  "name": "Login Social mediasites",
  "description": "",
  "id": "login-social-mediasites",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@Loginsample"
    }
  ]
});
formatter.scenarioOutline({
  "line": 39,
  "name": "Login esite using header",
  "description": "",
  "id": "login-social-mediasites;login-esite-using-header",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 38,
      "name": "@Loginesitewithheaderusingexamples"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "we have opened esite",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "we login to see esite dashboard using header with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "we close the esite",
  "keyword": "Then "
});
formatter.examples({
  "line": 45,
  "name": "",
  "description": "",
  "id": "login-social-mediasites;login-esite-using-header;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 46,
      "id": "login-social-mediasites;login-esite-using-header;;1"
    },
    {
      "cells": [
        "krishna",
        "moneykandan"
      ],
      "line": 47,
      "id": "login-social-mediasites;login-esite-using-header;;2"
    },
    {
      "cells": [
        "vinoth",
        "pass"
      ],
      "line": 48,
      "id": "login-social-mediasites;login-esite-using-header;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 75500,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Login esite using header",
  "description": "",
  "id": "login-social-mediasites;login-esite-using-header;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 38,
      "name": "@Loginesitewithheaderusingexamples"
    },
    {
      "line": 1,
      "name": "@Loginsample"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "we have opened esite",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "we login to see esite dashboard using header with \"krishna\" and \"moneykandan\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "we close the esite",
  "keyword": "Then "
});
formatter.match({
  "location": "Esitesteps.we_have_opened_esite()"
});
formatter.result({
  "duration": 148080500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krishna",
      "offset": 51
    },
    {
      "val": "moneykandan",
      "offset": 65
    }
  ],
  "location": "Esitesteps.we_login_to_see_esite_dashboard_using_header_with_and(String,String)"
});
formatter.result({
  "duration": 1040300,
  "status": "passed"
});
formatter.match({
  "location": "Esitesteps.we_close_the_esite()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.after({
  "duration": 45800,
  "status": "passed"
});
formatter.before({
  "duration": 28800,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Login esite using header",
  "description": "",
  "id": "login-social-mediasites;login-esite-using-header;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 38,
      "name": "@Loginesitewithheaderusingexamples"
    },
    {
      "line": 1,
      "name": "@Loginsample"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "we have opened esite",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "we login to see esite dashboard using header with \"vinoth\" and \"pass\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "we close the esite",
  "keyword": "Then "
});
formatter.match({
  "location": "Esitesteps.we_have_opened_esite()"
});
formatter.result({
  "duration": 38300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinoth",
      "offset": 51
    },
    {
      "val": "pass",
      "offset": 64
    }
  ],
  "location": "Esitesteps.we_login_to_see_esite_dashboard_using_header_with_and(String,String)"
});
formatter.result({
  "duration": 76600,
  "status": "passed"
});
formatter.match({
  "location": "Esitesteps.we_close_the_esite()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.after({
  "duration": 21000,
  "status": "passed"
});
});