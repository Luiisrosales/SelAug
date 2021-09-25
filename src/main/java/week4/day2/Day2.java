package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void day2() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		ChromeOptions chrome = new ChromeOptions();
		driver.switchTo().activeElement();
		driver.findElementByCssSelector("button[class = 'btn btn-primary']").click();
		driver.findElementByCssSelector("a[alt='IRCTCofficial instagram']").click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> myWin = new ArrayList<>(windowHandles);
		driver.switchTo().window(myWin.get(1));		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
