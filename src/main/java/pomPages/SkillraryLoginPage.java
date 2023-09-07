package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	//Declaration
	//address of gear WebElement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
    //address of search text filed
	@FindBy(name="q")
	private WebElement searchtb;
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialisation
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public void gearsButton() {
		gearsbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}
}
