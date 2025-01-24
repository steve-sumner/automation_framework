package com.stepneg.steps.cukes;

import com.stepneg.World;
import com.stepneg.builders.SomeBuilder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

public class MyStepdefs {

    @Autowired
    private World world;

    @Autowired
    @Lazy
    private SomeBuilder builder;

    @Value("some env string")
    private String neeee;

    @Given("I have {int} cukes")
    public void iHaveCukes(int arg0) {
        System.out.println(neeee);
    }

    @When("I wait {int} hour")
    public void iWaitHour(int arg0) {
        System.out.println(world.intro);
    }

    @Then("something should happen")
    public void somethingShouldHappen() {
        System.out.println(builder.GetMyBuilder());
    }
}
