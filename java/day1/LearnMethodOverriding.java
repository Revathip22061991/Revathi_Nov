package week3.day1;

public class LearnMethodOverriding extends ChromeDriverC {
	
	public void click(int a) {
		System.out.println("Method Overriding"+a);
		super.click(3);
	}
	public static void main(String[] args) {
		LearnMethodOverriding mo=new LearnMethodOverriding();
		mo.click(5);
	}

}
