package week1.day2;

public class LearnMethodAndObject {

	public void startApp() {
		System.out.println("Testleaf");
		}
	private String launchBrowser() {
		return "Chrome";
		}
void locateElement(int data,String name) {
	System.out.println("total number:"+data+ "  "  +"element name"+name);
}
protected void click(boolean actionPerformed) {
	// TODO Auto-generated method stub
System.out.println(actionPerformed);
}

public int value() {
return 6;
}
public static void main (String[] args) {
	LearnMethodAndObject mo=new LearnMethodAndObject();
	mo.click(false);
	
	String launchBrowser = mo.launchBrowser();
	System.out.println(launchBrowser);
	mo.locateElement(2,"Test");
	mo.startApp();
	int value = mo.value();
	System.out.println(value);
}

}