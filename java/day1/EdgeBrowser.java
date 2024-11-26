package week3.day1;

public class EdgeBrowser extends Browser{
	public void takeSnap() {
		System.out.println("Snapshot taken successfully");
	}
	public void clearCookies() {
		System.out.println("Browser cookies are cleared");
	}
	public void openURL() {
		System.out.println("Edge class URL is opened"+browserName+"Version"+browserVersion);
		super.openURL();//calling parent class
	}
   public static void main(String[] args) {
	EdgeBrowser eb=new EdgeBrowser();
	eb.openURL();
	eb.closeBrowser();
	eb.navigateBack();
	eb.takeSnap();
	eb.clearCookies();
	eb.openURL();
	
}
}
