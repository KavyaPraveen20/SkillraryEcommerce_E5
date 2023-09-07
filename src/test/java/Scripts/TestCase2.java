package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws Throwable{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.switchingTabs(driver);
		utilities.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utilities.dragAndDrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
		
	}
	

}
