package org.hex;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/resources/failed.txt", 
dryRun=false ,glue = {"org.hex"},plugin = {"html:Report/failed", "JASON:Report/jasonreport.jason"},  monochrome=true)

public class TestReRunner {

}
