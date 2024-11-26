package week3.day1;

public class Browser {
	
	String browserName= "Edge";
	int browserVersion= 132;
	
	public void openURL() {
		System.out.println("Parent class-Browser URL is opened successfully");
	}
	public void closeBrowser() {
		System.out.println("Browser is closed successfully");
	}
	public void navigateBack() {
		System.out.println("Browser is navigated successfully");
	}

}
