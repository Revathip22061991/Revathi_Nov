package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> subject= new ArrayList<String>();
		
		//Add method in List
		subject.add("Maths");
		subject.add("Tamil");
		subject.add("English");
		subject.add("Hindi");
		subject.add("Social");
		subject.add("Tamil");
		
		System.out.println(subject);
		
		//Size method in List
		int size = subject.size();
		System.out.println("List Length:"+size);
		
		//index
		subject.add(2, "GK");
		System.out.println(subject);
		
		//remove method in List
		subject.remove(4);
		System.out.println(subject);
		
		//contains-checks case sensitive
		boolean contains = subject.contains("tamil");
		System.out.println(contains);
		
		//get method in List
		String string = subject.get(5);
		System.out.println(string);
		
		//get all the values in the list
		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
	
		//clear
		subject.clear();
		System.out.println(subject);
		
		String string2 = subject.get(4);
		System.out.println();
		}
		
	}

}
