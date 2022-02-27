package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;


public class InvalidEmailId extends BasePage{

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String email_id = "abc123";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";

    public InvalidEmailId(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSignIn() {
        driver.findElement(By.xpath(signIn_xpath)).click();
    }

    public static void createAccount(String emailid) {
        emailid= emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
    }
	
	public static void verifyInvalidEmailIdErrorMessage(String expectedErrorMessage){
		string errormessage = driver.findElement(By.id("create_account_error")).getText();
		Assert.assertEquals(errormessage, expectedErrorMessage);
	}
}
