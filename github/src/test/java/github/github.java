package github;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class github {
	
	@Test
   public void githubTesting() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\ec-new\\Selenium2\\src\\test\\resources\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 Thread.sleep(1000);
	 System.out.println("completed successfully by me");
	 driver.close();
	 driver.quit();

	}
}
	
