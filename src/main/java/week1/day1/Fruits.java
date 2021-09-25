package week1.day1;

import java.lang.invoke.SwitchPoint;
import java.util.Iterator;

public class Fruits {

	public static void main(String[] args) {
		int[] numbers = {}; 
		String[] fruitnames = {
				"Apple", "Mango", "Grape"
		};
		System.out.println();
		System.out.println(fruitnames.length);
		
		//enhanced for loop
		for(String eachFruit: fruitnames) {
			System.out.println(eachFruit);
		}
		
		String browser = "Google";
		
		switch(browser) {
		
		case "Firefox":
			System.out.println("Firefox Launched");
			break;
		case "Google":
			System.out.println("Google launched");
		case "Opera":
			
		}
		
	}

}
