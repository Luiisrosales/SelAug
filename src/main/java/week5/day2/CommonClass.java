package week5.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelDataLib;

public class CommonClass {
	
	protected RemoteWebDriver driver;
	protected String fileName = "";
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");	     
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		File ss = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, new File("./sc.png"));			
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.quit();
	}
	
	@DataProvider(name = "loginSouce")
	public String[][] myTestData(){
		String[][] data = null;
		try {
			data = ExcelDataLib.getData(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}

}
