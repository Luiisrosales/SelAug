package week6.day2;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().window().maximize();
		
		
		File file = new File("./data/sample.pdf");
		driver.findElementById("myFile")
		.sendKeys(file.getAbsolutePath());	
		
		
		
	}

}
