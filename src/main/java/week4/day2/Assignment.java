package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment {

	@Test
	public void assignmentWeek4() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://devlabs-860f0.web.app/contextmenu");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElementByCssSelector(".container button");
		Actions builder = new Actions(driver);
		builder.contextClick(button).perform();
		driver.findElementByCssSelector("button[role='menuitem']").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement dragabble = driver.findElementById("draggable");
		builder.dragAndDropBy(dragabble, 100, 50);
		builder.perform();
		
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(frame);
		WebElement order = driver.findElementByClassName("ui-state-default ui-sortable-handle");
		builder.clickAndHold(order);

	}

}
