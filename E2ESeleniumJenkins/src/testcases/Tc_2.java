package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_2 {
	
	@Test
	
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver12.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementByXPath("//button[@title='Only allow essential cookies']").click();
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
	

}
