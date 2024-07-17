package com.example.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@ValidCredentials", features = "src/test/resources/features", glue = "com.example.definitions",
plugin= {"pretty","html:target1/site/cucmber-pretty", "json:target1/cucumber.json","rerun:target1/rerun.txt"} //to generate different types of reporting
)

public class CucumberParallelRunTests {

}