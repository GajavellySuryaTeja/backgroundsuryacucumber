package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Backgroundfacebook",
glue = "StepDefinations",
dryRun = false,
monochrome = true
)
public class Testrunner {

}
