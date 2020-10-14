package github;



import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class github {
	ExtentReports extent;
	WebDriver driver = null;
	
	@BeforeTest
	public void starttest() throws InterruptedException
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Administrator\\Desktop\\extentreport\\extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
   public void githubTesting() throws InterruptedException{
     ExtentTest test = extent.createTest("facebooktest","tests a facebook functionality");
	 test.pass("opening the web browser");
	 driver.get("https://www.facebook.com");
	 test.pass("entering the email id");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("charanvunnam@gmail.com");
	 test.pass("passing the password");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Charan1906@");
	 test.pass("clicking the login button");
	 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	 Thread.sleep(10000);
	 test.pass("successfully opened");
	 driver.close();
	 driver.quit();
	 test.info("successfully completed the testcase1 in aws");
	 extent.flush();
	}
}	
