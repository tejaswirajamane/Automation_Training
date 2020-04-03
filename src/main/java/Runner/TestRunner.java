package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Samplee\\cucumber\\src\\main\\java\\features\\Login.feature", //--->feature file  located place
				glue = { "stepsDefinations" },//-->Location of stepdefinations file
				format= {"pretty","html:test-output"},//--->Format for getting output in proper way,diiferent ytpe of reporting
				monochrome= true,//---->Display the console output in a proper readable format
				strict=true,//---->It will fail the test case when thier are undefined or unmatched file 
				dryRun=false)//-->Verfies the mapping is  correct or  not,(if dryRun=flase then only the test execution starts)	
public class TestRunner {

}
