package LaunchingCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;


public class LaunchingCode {
	WebDriver driver;
	@Test
	public void test() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Modeling Tools 2020-09 R\\eclipse-modeling-2020-09-R-win32-x86_64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
  
}
