package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\MavenProject\\MavericTest04052020\\FeatureFile\\sample4.feature",
	glue = "StepDef" ,
	//glue = "MobileStep",
	//tags = "@Scenario1,@Scenario2,@Scenario3"
	tags = "@Scenario4A"
		
		)
public class RunnerClass
{
	
}
