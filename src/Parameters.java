import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	
	WebDriver driver = new ChromeDriver(); 
	
	SoftAssert myAssertion = new SoftAssert(); 
	
	
	static String URl = "https://www.google.com/ar";
	String[] WebSiteURLS = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
	
	String EnglishwebSite = "https://www.almosafer.com/en"; 
	String ArabicWebsite = "https://www.almosafer.com/ar"; 
	Date today = new Date();

}
