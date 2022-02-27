package autoapp.automation.stepDef;

import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.NavigateSummerDresses;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateSummerDresses {

    @Given("^Automation practice application is opened$")
    public void automation_practice_application_is_opened() throws Throwable {
        NavigateSummerDresses.openApplicaiton();
    }

    @When("^I hover on Dresses$")
    public void i_hover_on_dresses() throws Throwable {
        NavigateSummerDresses.hoverDresses();

    }

    @And("^I click on Summer Dresses")
    public void i_click_on_summer_dresses() throws Throwable {
        NavigateSummerDresses.clickSummerDresses();
        Thread.sleep(5000);
    }


    @Then("^Summer Dresses page should open$")
    public void summer_dresses_page_should_open() throws Throwable {
        NavigateSummerDresses.verifySummerDressesPage();
        Thread.sleep(5000);
    }
}
