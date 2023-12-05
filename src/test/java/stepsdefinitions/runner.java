package stepsdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions (
	
		features="src/test/resources/Feature",
		glue= {"stepsdefinitions"},monochrome=true,
		tags="",
		plugin = {"pretty", "json:target/rapport.json",
                "html:target/reports/cucumber.html"}
		)

public class runner {

}
