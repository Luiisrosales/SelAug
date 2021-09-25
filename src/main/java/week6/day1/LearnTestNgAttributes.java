package week6.day1;

import org.testng.annotations.Test;

import week5.day2.CommonClass;

public class LearnTestNgAttributes extends CommonClass{
	@Test(invocationCount = 2)
	public void login() {
		System.out.println("Running");
	}

}
