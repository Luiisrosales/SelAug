package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium {

	@Test
	public void selenium() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		driver.navigate().to("https://www.facebook.com/");
		String faceTitle = driver.getTitle();
		System.out.println(faceTitle);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		System.out.println("Step 1 goto https://computer-database.gatling.io/");
		driver.get("https://computer-database.gatling.io/");
		System.out.println("Step 2 click add new computer");
		driver.findElementById("add").click();
		driver.findElementById("name").sendKeys("My computer");
		driver.findElementById("introduced").sendKeys("2021-08-01");
		driver.findElementById("discontinued").sendKeys("2021-08-01");
		System.out.println("Step 3 check if it is multiple or not");
		WebElement company = driver.findElementById("company");
		Select companydd = new Select(company);
		System.out.println(companydd.isMultiple());
		System.out.println("Step 4 select MOS tech using text");
		companydd.selectByVisibleText("MOS Technology");
		WebElement selection = companydd.getFirstSelectedOption();
		System.out.println(selection.getText());
		System.out.println("Step 5 select by value");
		companydd.selectByValue("3");
		WebElement value = companydd.getFirstSelectedOption();
		System.out.println(value.getText());
		System.out.println("Step 6  Select the last one");
		int options = companydd.getOptions().size();
		companydd.selectByIndex(options - 1);
		System.out.println("Step 7 click create this computer");
		driver.findElement(By.cssSelector("#main > form > div > input")).click();
		
		
		driver.quit();
		
		
		
	}

}
