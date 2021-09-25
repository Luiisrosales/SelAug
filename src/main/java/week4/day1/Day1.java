package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void day1() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElementByClassName("gLFyf");
		searchBox.sendKeys("cricket", Keys.ENTER);
		List<WebElement> cricketList = driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		System.out.println("Number of Cricket words is: " + cricketList.size());
		driver.quit();
		
	}

}
