package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/resources/features",
        glue = {"org.opencart.stepdefs"},
        //plugin = {"pretty","html:target/cucumber-reports", "json:target/cucumber.json"},
        plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        publish=true)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
