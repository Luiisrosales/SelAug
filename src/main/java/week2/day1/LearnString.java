package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		String str = "devlabs";
		String str1 = new String("devlabs");
		
		String one = "devlabs";
		String two = "devlabs";
		System.identityHashCode(one);
		
		if (one == two) {
			System.out.println("true");
		}
		else
			System.out.println("False");
		
		//1. Write a note on == and .equals
		
		String string1 = "Hello World";
		String string2 = "Hello World";
		String string3 = new String("Hello World");
		
		if(string1 == string2)
			System.out.println("the same");
		else
			System.out.println("not the same");
		
		if(string1.equals(string3))
			System.out.println("the same");
		else
			System.out.println("not the same");
		
		//2. How do you check if a given String is Palindrome or not? (write is a function)
		//madam == madam
		LearnString l = new LearnString();
		l.isItPalindrome("121");
		
		
		
		//3. find the occurance of 'e' from "selenium"
		String word = "selenium";
		char[] charac = word.toCharArray();
		int ocurrances;
		
		
		//StringBuffer, StringBuilder
		StringBuffer sbf = new StringBuffer("Selenium");
		System.out.println(sbf.append("Course"));
		System.out.println(sbf);
		
		StringBuilder sbf1 = new StringBuilder("Selenium");
		System.out.println(sbf.append("Course"));
		System.out.println(sbf);
		
	}	
	
	public void isItPalindrome(String word) {
		char[] charac = word.toCharArray();
		String reverseWord = "";
		
		for(int i= charac.length - 1;i>=0 ; i-- ) {
			reverseWord += word.charAt(i);
		}
		
		if (reverseWord.equals(word)) {
			System.out.println("It's Palindrome");
		}
		else
			System.out.println("it's no Palindrome");
	}
	

}
