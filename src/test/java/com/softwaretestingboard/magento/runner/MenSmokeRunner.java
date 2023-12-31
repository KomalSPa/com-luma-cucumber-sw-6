package com.softwaretestingboard.magento.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/resources/featurefile/MenTest.feature",
        glue = "com/softwaretestingboard/magento",
        tags= "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class MenSmokeRunner {
}
