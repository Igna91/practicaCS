package com.ps.grupo2.comunio;


import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;

import static junit.framework.TestCase.assertTrue;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"
                },
        //tags = { "@wip" },
        dryRun = false,
        features = {"src/test/resources/features"},
        strict = false,
        monochrome = true,
        glue = {"com.ps.grupo2.comunio", "gradle.cucumber"}

)

public class CucumberTestCase {

        @Test
        public void prueba(){
                assertTrue(true);
        }

        @BeforeSuite
        public static void setUp(){}

        @AfterSuite
        public static void tearDown(){}
}