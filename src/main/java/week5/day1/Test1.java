package week5.day1;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dependsOnMethods = "signup")
	public void login() {
		System.out.println("Login");
	}

}
