import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters {

	@BeforeTest
	public void myBeforeTest() {
		driver.get(URl);
	}

	@Test()
	public void check_the_website_default_language() {

		if (driver.getCurrentUrl().equals(EnglishwebSite)) {

			WebElement HTMLPAGE = driver.findElement(By.tagName("html"));
			String Actual = HTMLPAGE.getAttribute("lang");
			String Expected = "en";

			myAssertion.assertEquals(Actual, Expected);

		}

		else if (driver.getCurrentUrl().equals(ArabicWebsite)) {
			WebElement HTMLPAGE = driver.findElement(By.tagName("html"));
			String Actual = HTMLPAGE.getAttribute("lang");
			String Expected = "ar";

			myAssertion.assertEquals(Actual, Expected);

		} else {

			myAssertion.assertEquals(
					driver.getCurrentUrl().equals(ArabicWebsite) || driver.getCurrentUrl().equals(EnglishwebSite),
					true, "this is to test the website url ");

		}

	}

	@AfterTest
	public void myAfterTest() {
		myAssertion.assertAll();

	}

}
