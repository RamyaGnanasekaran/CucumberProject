package org.hex;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/CheckBoxDemo.feature", glue = { "org.hex" }, plugin = { "html:Report",
		"json:Report/jasonreport.json" }, monochrome = true)

public class TestRunner {

}