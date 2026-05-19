package steprunner;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"src/test/resources/Featuresfile"},
	glue= {"stepdefinition"},
	plugin= {"pretty", "html:target/karrar.html"})
			
	public class Runner extends AbstractTestNGCucumberTests{

	}


