package runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature",
		          glue="steps",
		          monochrome=true,
		          /*dryRun=true,
		          snippets=SnippetType.CAMELCASE*/
		          plugin={"pretty","html:reports"}
		        
		          )
public class RunTest extends AbstractTestNGCucumberTests {
	
	

}
