package week5.day2;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Assignment1 extends CommonClass{
	
	
	
	@Test
	public void googleChrome() {
		driver.get("https://www.google.com/");
		File ss = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, new File("./gc.png"));			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

}
