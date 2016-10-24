package wdpackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WdTestScript {

	WebDriver driver;

	@Before
	public void setup() {
		System.out.println("Printing in the console");

		System.setProperty("webdriver.gecko.driver",
				"C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testGoogle() {

		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.name("btnG")).click();

		// driver.findElement(By.linkText("x")).click();

		// Thread.sleep(2000);
		driver.findElement(By.className("ab_button")).click();
		driver.findElement(By.linkText("Hulp bij zoeken")).click();
		// driver.findElement(By.partialLinkText("Google")).click();

		driver.findElement(
				By.xpath("html/body/div[2]/div[2]/section/div/article/nav/section[1]/div/div/div[6]/a"))
				.click();

		// Thread.sleep(2000);

	}
	
	@Test
	public void testHln(){
		driver.get("http://www.hln.be");
		
		driver.findElement(By.partialLinkText("CETA")).click();
		
	}

	@After
	public void stop() {
		driver.quit();
	}

}
