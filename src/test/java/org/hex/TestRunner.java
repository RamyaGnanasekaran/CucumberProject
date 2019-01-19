package org.hex;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/AddCustomer.feature", 
dryRun=false ,glue = {"org.hex"},plugin = {"html:Report", "rerun:src/test/resources/failed.txt"},  monochrome=true)

public class TestRunner {

}