package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private WebElement addToCartButton;

	@FindBy(css = "a.shopping_cart_link")
	private WebElement cartLink;

	public WebElement getAddToCartButton() {
		return cartLink;
	}

}
