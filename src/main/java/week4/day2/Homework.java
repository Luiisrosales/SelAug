package week4.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework {

	@Test
	public void homework() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/table");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("table tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			WebElement name = columns.get(1);
			if(name.getText().equals("Man")) {
				WebElement lastCol = columns.get(3);
				lastCol.findElement(By.tagName("input")).click();
			}
			
		}
		
		driver.quit();
		
		

	}

}
