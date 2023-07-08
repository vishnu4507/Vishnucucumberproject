package RunnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "src/test/java/features", glue = {"Steps","Hooks"},dryRun = false,
snippets = SnippetType.CAMELCASE,monochrome = true,plugin = {"html:Reports","junit:reports/result.xml"},
tags = {"@reg"})
		
public class Runner {
	
	

}
