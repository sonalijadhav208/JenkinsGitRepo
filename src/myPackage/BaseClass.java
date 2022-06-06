package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

	@Test
	public void beforemethod() throws IllegalAccessException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\risha\\eclipse-workspace\\Ant_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
