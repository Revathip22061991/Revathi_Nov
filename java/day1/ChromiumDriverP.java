package week3.day1;

public class ChromiumDriverP extends RemoteWebDriverGP{
	
	
   public void startApp() {
	   System.out.println("ChromiumDriver P");
	}
   public static void main(String[] args) {
	   
	   ChromiumDriverP cd = new ChromiumDriverP();
	   cd.startApp();
	   cd.findElement();
	   cd.findElements();
}
}
