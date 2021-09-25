package week6.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week5.day2.CommonClass;

public class LoginSouceTest extends CommonClass{
	@BeforeTest
	void setData() {
		fileName = "tc001";
	}
	
	@Test(dataProvider = "loginSouce")
	public void loginNow(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
