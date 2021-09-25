package week1.day2;

public class Mobile {
	
	public String mobileBrand() {
		return "AT&T";
	}
	
	public boolean isItBrandNew() {
		return false;
	}
	
	public void mobileInfo() {
		System.out.println("Description: With this phone you will be able to navigate with the fastest connection");
	}
	
	public void searchMobilemodel(int idModel) {
		if(idModel == 1)
			System.out.println("Model: Samsung Galaxy Note");
		else 
			System.out.println("Model: Iphone XS MAX");
	}
	
	public void searchMobilemodel(String name) {
		if(name.equals("Samsung"))
			System.out.println("Model: Samsung Galaxy Note");
		else 
			System.out.println("Model: Iphone XS MAX");
	}
	

}
