package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	//address of selenium training
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	//address of mycart
	@FindBy(id="mycart")
	private WebElement carttab;
	//address of facebook tab
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebooktab;
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	public WebElement getCarttab() {
		return carttab;
		
	}
	
	public void facebookicon() {
		facebooktab.click();
	}
	

}
