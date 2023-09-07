package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1(){
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.mouseOver(driver, sd.getCoursetab());
		sd.Seleniumtrainingtab();
		AddtocartPage d=new AddtocartPage(driver);
		utilities.doubleClick(driver, d.getplus());
		d.addtocart();
		utilities.alertPopup(driver);
	}

}
