package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.PendingException;
import hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BlankStepDefs {
    public WebDriver driver;

    public BlankStepDefs() {
        driver = Hooks.driver;
    }

    @When("^I open Google website$")
    public void i_open_Google_website() throws Throwable {

        driver.get("https://www.google.com.br");
        throw new PendingException();
    }

    @When("^I enter some words$")
    public void i_enter_some_words() throws Throwable {
        driver.findElement(By.id("lst-ib")).sendKeys("Tiago Canabarro");
        throw new PendingException();
    }

    @Then("^I should be able to click on search button$")
    public void i_should_be_able_to_click_on_search_button() throws Throwable {
        driver.findElement(By.name("btnK")).click();

        assertEquals("All", "");

        throw new PendingException();

    }
}






