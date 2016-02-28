package com.ps.grupo2.comunio;



import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import static junit.framework.TestCase.assertTrue;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:../Test-REPORT/cucumber-html-report",
                "json:../Test-REPORT/cucumber.json", "pretty:../Test-REPORT/cucumber-pretty.txt",
                "usage:../Test-REPORT/cucumber-usage.json", "junit:../Test-REPORT/cucumber-results.xml"
                },
        //tags = { "@wip" },
        dryRun = false,
        features = {"src/test/resources/features"},
        strict = false,
        monochrome = true,
        glue = {"com.ps.grupo2.comunio", "gradle.cucumber"}

)

public class CucumberTestCase {

}