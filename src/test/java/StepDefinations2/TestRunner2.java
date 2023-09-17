package StepDefinations2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginUsingDataTable2.feature", glue = { "StepDefinations2" },plugin = {"json:target/cucumber.json"})
public class TestRunner2 {

}
