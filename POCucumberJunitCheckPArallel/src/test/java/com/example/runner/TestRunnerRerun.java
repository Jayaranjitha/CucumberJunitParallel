package com.example.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/rerun.txt"}, 
		//Cucumber execute failed scenarios from this file
		//format= {"html:target/site/cucumber-pretty;json:target/cucumber.json&quot"},
		glue={"com.example.definitions"}, //the path of the step definition files
		plugin= {"pretty","html:target8/site/cucmber-pretty", "json:target8/cucumber.json", "junit:target8/cucumber.xml","rerun:target8/rerun.txt"},
		//"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html   to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		dryRun = false//to check the mapping is proper between feature file and step def file
		//tags = {"@all"}			
		)



public class TestRunnerRerun
{
}