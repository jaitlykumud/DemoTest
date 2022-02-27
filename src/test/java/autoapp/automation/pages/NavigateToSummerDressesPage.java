package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;


public class NavigateSummerDresses extends BasePage{

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String email_id = "abc123";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";

    public NavigateSummerDresses(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void hoverDresses() {
		Actions actions = new Actions(driver);
		WebElement megaMenu = driver.findElement(By.xpath("//a[@title='Dresses']"));
		actions.moveToElement(megaMenu);
	}
	
	public static void clickSummerDresses() {
		driver.findElement(By.xpath("//a[@title='Summer Dresses']")).click();
	}
	
	public static void verifySummerDressesPage() {
		String summerDressesUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
		
		String actualUrl = driver.getCurrentUrl();
		if (summerDressesUrl.equals(actualUrl)) {
         System.out.println("Summer Dresses page loaded successfully");
               }
      else {
         System.out.println("Summer Dresses page not loaded");
      }
	
	}
}
