package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginStep2 {
	private WebDriver driver;
	public LoginPage login;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.out.println("user_is_on_login_page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user_enters_username_and_password");
		// driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		// driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		login.getUsername().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user_clicks_on_login_button");
		// driver.findElement(By.cssSelector("#login-button")).click();
		login.getLoginBtn().click();
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		System.out.println("user_is_navigated_to_login_page");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test Passed");
	}

}