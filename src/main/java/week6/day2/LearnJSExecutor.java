package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJSExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/edit");
		driver.manage().window().maximize();
		
		WebElement edit = driver.findElementByXPath("//*[@id='fullName']");
		String script1 = "arguments[0].value = 'Luis'";
		driver.executeScript(script1, edit);
		
		//click
		driver.get("https://devlabs-860f0.web.app/button");
		driver.executeScript("document.getElementById('button1').click()");
		
		//Title
		System.out.println(driver.executeScript("return document.title"));
		
		//CHange color
		driver.get("https://devlabs-860f0.web.app/button");
		driver.executeScript("document.getElementById(\"button3\").style.backgroundColor = \"red\"");
		
		driver.quit();
		
		
		
		
	}

}
