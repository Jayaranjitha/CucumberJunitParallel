package com.example.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@MissingUsername", features = "src/test/resources/features", glue = "com.example.definitions",
plugin= {"pretty","html:target/cucumber-html-report", "html:target/site/cucmber-pretty","json:target/cucumber.json","json:target/cucumber.xml","rerun:target/rerun.txt"} //to generate different types of reporting
)

public class CucumberRunnerTests {

}