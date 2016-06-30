package com.ideoplex.tutorial;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber-report.json",
                           "html:target/cucumber-report"},
                           glue = "com.ideoplex.tutorial")
public class CucumberTest extends AbstractTestNGCucumberTests
{
}
