package hrmRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="F:\\new1\\DemoHRM\\src\\main\\java\\HRMfeature\\loginHRM.feature",
                  glue="stepDefination",
                  plugin = {"pretty","html:target/report.html"}
		)
public class HRMrunner {


}
