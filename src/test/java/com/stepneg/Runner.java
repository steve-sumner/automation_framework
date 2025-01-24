package com.stepneg;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.stepneg.steps",
        plugin = { "pretty", "html:target/html-reports" }
)
public class Runner {
}
