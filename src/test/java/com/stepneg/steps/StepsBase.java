package com.stepneg.steps;

import com.stepneg.AppConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

// This init the spring config so available for tests

@CucumberContextConfiguration
@ContextConfiguration(classes = AppConfig.class)
public class StepsBase {
}
