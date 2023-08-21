package org.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource/Feature/CBT_EC2299.feature",
		glue = {"org/Stepdefinations"},
		monochrome = true,
		dryRun= false ,
//		tags = "@Smoke or @Regression",
		tags= "@Regression",
		plugin = {"pretty","html:target/Html_Reports/ReFresh.html"}
		
		)

public class CBTTestRunner {

}
