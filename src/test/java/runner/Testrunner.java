package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags= "@mazonmobilepage",
		features="C:\\Users\\mayan\\eclipse-workspace\\com.seleniumbddcucumber\\src\\test\\resources\\Features",
		glue="stepdef",
		strict=true,
		monochrome=true,
		plugin= {"json:target/cucumber.json","html:target/site/cucumber-pretty"}
			
		
		)
public class Testrunner {
	

}
