package week5.day2;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends CommonClass{
	
	WebElement errorMessage;
	
	@Test(dataProvider = "loginSauce")
	public void login(String username, String url, Boolean scenario) {
		driver.get("https://www.saucedemo.com/");
		driver.findElementById("user-name").sendKeys(username);
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementByCssSelector("#login-button").click();
		if (scenario) {
			String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
		}
		else {
			errorMessage = driver.findElementByCssSelector("h3[data-test='error']");
			Assert.assertEquals(errorMessage.getText(), "Epic sadface: Sorry, this user has been locked out.");		
		}		
			
	}
	
	@DataProvider(name="loginSauce")
		public Object[][] data(){
			return new Object[][] {
				{"standard_user", "secret_sauce", true},
				{"locked_out_user", "secret_sauce", false},
				{"problem_user", "secret_sauce", true}				
			};
		}
	

}
