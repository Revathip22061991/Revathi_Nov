package week1.day2;

public class LearnObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethodAndObject m=new LearnMethodAndObject();
		m.click(false);
		m.locateElement(1, "test");
		m.startApp();
		int value = m.value();
		System.out.println(value);
	}
}
