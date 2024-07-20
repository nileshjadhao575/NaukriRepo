package fbrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="F:\\new1\\DemoFb\\src\\test\\resources\\FeatureFB\\Fblogin.feature",
                 glue="stepDefination",
                 plugin = {"pretty", "html:target/Cucumber-html-report.html",}
		)




public class Fbrunner {

}
