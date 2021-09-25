package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void day2Week3() {
		//Xpath
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/frame");
		driver.manage().window().maximize();
		/*driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("standard_user");
		driver.findElementByXPath("//input[@placeholder='password']").sendKeys("secret_sauce");
		/*
		 * //tagName[contains(@id,'partialValue')]
		 * //input[contains(@value,'Chatterjee')]
		 * 
		 * */
		//driver.findElementByXPath("input[contains(@class, 'submit')]").click();
		driver.switchTo().frame("myframe");
		driver.findElementById("username").sendKeys("admin");
		driver.findElementById("password").sendKeys("admin");
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
