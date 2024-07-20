package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\new1\\Demo\\src\\test\\resources\\FeatureFile\\Login.feature",
                 monochrome= true,
                 dryRun= false ,
                 glue = {"stepDefination"},
                plugin = {"pretty", "html:target/Cucumber-html-report",}
                
		
		)




public class Runner {
	
	

}
