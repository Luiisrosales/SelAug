package week1.day2;

public class MyMobile {

	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		System.out.println("Mobile Info");
		System.out.println("Brand Name: " + myMobile.mobileBrand());
		System.out.println("New: " + myMobile.isItBrandNew());
		myMobile.mobileInfo();
		
		String name = "Luis";
		
		char[] charac = name.toCharArray();
		
		for(int i= charac.length - 1;i>=0 ; i-- ) {
			System.out.print(charac[i]);
		}
		
		String str = "Welcome to Selenium";
		String [] split = str.split(" ");
		System.out.println(split.length);
		System.out.println(split[0]);
		for(int i= split.length-1;i>=0;i--) {
			System.out.print(split[i] + " ");
		}
		
	}

}
