package week3.day1;

public class Safari extends Edge{


	public void readerMode() {
		System.out.println("The mode is readermode");
	}
	public void fullScreenMode() {
		System.out.println("The mode is fullScreenmode()");
	}
	
	public static void main(String[] args)
	
	{
		Safari s = new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.openIncognito();
		s.clearCache();
		s.takeSnap();
		s.clearCookies();
		System.out.println(s.browserName);
		System.out.println(s.browserVersion);
		
	}
}
