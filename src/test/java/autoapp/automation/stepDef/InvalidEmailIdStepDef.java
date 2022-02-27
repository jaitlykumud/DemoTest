package autoapp.automation.stepDef;

import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.InvalidEmailId;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidEmailId {

    @Given("^Automation practice application is opened$")
    public void automation_practice_application_is_opened() throws Throwable {
        InvalidEmailId.openApplicaiton();
    }

    @When("^I click sign in$")
    public void i_click_sign_in() throws Throwable {
        InvalidEmailId.clickSignIn();

    }

    @And("^I create account with incorrect emailid \"([^\"]*)\"$")
    public void i_create_account_with_incorrect_emailid(String incorrectEmailId) throws Throwable {
        InvalidEmailId.createAccount(incorrectEmailId);
        Thread.sleep(5000);
    }


    @Then("^I should get below error message$")
    public void i_should_get_below_error_message(String expectedErrorMessage) throws Throwable {
        InvalidEmailId.verifyInvalidEmailIdErrorMessage(expectedErrorMessage);
        Thread.sleep(5000);
    }
}
