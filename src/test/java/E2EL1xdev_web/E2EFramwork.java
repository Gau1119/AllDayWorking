package E2EL1xdev_web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2EFramwork {

	
	@Test
	
	public void  name() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev-v2.l1xapp.com/connect");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rohitbhosle705@gmail.com");
		
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("Gaurav@11");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		
		
	}
}
