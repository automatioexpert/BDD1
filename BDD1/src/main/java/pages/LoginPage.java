package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(css = "input#user-name")
	private WebElement username;

	@FindBy(css = "input#password")
	private WebElement password;

	@FindBy(css = "#login-button")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;

	}

	public WebElement getPassword() {
		return username;

	}

	public WebElement getLoginBtn() {
		return username;

	}

}
