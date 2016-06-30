package com.ideoplex.tutorial;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

import org.testng.Assert;

public class Stepdefs {
   // private Belly belly;
   /*
    private int waitingTime;

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
        //belly = new Belly();
        //belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound) throws Throwable {
        String actualSound = "kuku";//belly.getSound(waitingTime);
        //actualSound = "wrong value";
        Assert.assertEquals(actualSound, expectedSound);
    }*/
    
    @Given("^prospective user with email \"([^\"]*)\" pre-exists$")
public void prospective_user_with_email_pre_exists(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    com.ideoplex.tutorial.User u = new com.ideoplex.tutorial.User();
}

@Given("^email \"([^\"]*)\" is not pre-registered$")
public void email_is_not_pre_registered(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user submits add \"([^\"]*)\" form$")
public void user_submits_add_form(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^email \"([^\"]*)\" is registered$")
public void email_is_registered(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Given("^email \"([^\"]*)\" is pre-registered$")
public void email_is_pre_registered(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^duplicate email \"([^\"]*)\" error is thrown$")
public void duplicate_email_error_is_thrown(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
     Assert.assertEquals(2, 25);
}
}
