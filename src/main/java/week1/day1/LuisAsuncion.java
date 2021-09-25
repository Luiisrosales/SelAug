package week1.day1;

import java.util.Iterator;

public class LuisAsuncion {

	public static void main(String[] args) {
		
		/*TODO - 1:

			1. Create a class with your name
			2. Declare different types of variable with all your deatils
			3. Print your details*/
		
		String name = "Luis Fernando Asuncion Rosales";
		char randomChar = 'A';
		byte age = 24;
		short salary = 1100;
		int favoriteNumber = 11;
		long phone = 50360267252l;
		double height = 1.65;
		float weight = 150.5f;
		boolean isTaskCompleted = true;
		
		System.out.println("Luis Asuncion Information");
		System.out.println("Full Name: " + name);
		System.out.println("Ramdon Char: " + randomChar);
		System.out.println("I am " + age + " years old");
		System.out.println("My Salary is: " + salary);
		System.out.println("My favorite number is: " + favoriteNumber);
		System.out.println("My phone Number is: " + phone);
		System.out.println("My height is " + height + " m");
		System.out.println("My weight is " + weight + " pounds");
		System.out.println("Did I Complete the task? " + isTaskCompleted);
		
		
		//TODO 3:
		//Print the 2 tables
			
		for(int i = 1; i <=10; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		
		
		/*1. Declare an array with 5 of your friends name
		2. print all the names in the reverse order*/
		
		
		String[] friends = {"Alex", "Elgar", "Ronny", "Kevin", "Ruben"};
		
		for(int i=friends.length -1; i>=0; i--) {
			System.out.println("Friend " + (i+1) + " " +friends[i]);
		}
		
		

	}

}
