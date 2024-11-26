package week3.homeassignments;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Enter the Credentials");
	}
	public void navigateToHomePage() {
		System.out.println("Navigated to Home Page");
	}
     public static void main(String[] args) {
		TestData td=new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}
	}

