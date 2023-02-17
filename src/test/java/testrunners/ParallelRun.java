package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","json:target/cucumber-reportreport2.json"}, 
		monochrome = true,
		glue = { "stepDefinitions","AppHooks" },
		features = { "src/test/resources/features/Addcandidate.feature"}
		)



public class ParallelRun extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}

// my second line