package github;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {
	
	public void githubmethod() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/new/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https//:www.facebook.com");
	 Thread.sleep(1000);
	 driver.close();
	 driver.quit();
	}
	}
	
