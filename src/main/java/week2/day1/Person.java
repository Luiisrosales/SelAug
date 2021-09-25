package week2.day1;

public class Person {
	String name;
	int age; 
	
	private Person() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	private Person(int age, String name) {
		System.out.println("Name: " + name + " Age: "+ age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person(24, "Luis");
	}

}
