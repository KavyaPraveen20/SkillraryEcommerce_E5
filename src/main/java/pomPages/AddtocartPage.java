package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	//Declaration
	//address of addtocart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	//address of +icon
	@FindBy(id="add")
	private WebElement plusicon;
	
    //initilaisation
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public void addtocart() {
		addtocartbtn.click();
	}
	
	public WebElement getplus() {
		return plusicon;
		
	}
}
