package parallel;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=("src/test/resources/parallel"),
		glue={"parallel"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		}
	) 
public class ParallelRun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	

}
