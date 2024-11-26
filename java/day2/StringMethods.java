package week3.day2;

import java.util.Iterator;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String value= "Learn String Methods";
		
		//Split method-eliminate the spaces
		String[] split = value.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		System.out.println("");
		System.out.println("**********************************************************");
		//split method-eliminate the char-e
		String[] split2 = value.split("e");
		for (int i = 0; i < split2.length; i++) {
			System.out.print(split2[i]);
		}
		System.out.println("");
		System.out.println("**********************************************************");
		//split method-eliminate the char-ear
		String[] split3 = value.split("ear");
		for (int i = 0; i < split3.length; i++) {
			System.out.print(split3[i]);
		}
		System.out.println("");
		System.out.println("**********************************************************");
		//replace method-replace only one char
		String data="Selenium";
		String replace = data.replace('e', 'E');
        System.out.println(replace);
        System.out.println("");
		System.out.println("**********************************************************");
	    //replaceAll method-replace more than one char
        String name = "TestLeaf2024@gmail.com";
        String replaceAll  = name.replaceAll("[a-z]", "&");
        System.out.println(replaceAll);
        System.out.println("");
		System.out.println("**********************************************************");
        //replaceAll method-replace all the numbers
        String name1 = "TestLeaf2024@gmail.com";
        String replaceAll1  = name1.replaceAll("[0-9]", "&");
        System.out.println(replaceAll1);
        System.out.println("");
		System.out.println("**********************************************************");
	    //replaceAll method-replace all the numbers except 0 to 9
        String name2 = "TestLeaf2024@gmail.com";
        String replaceAll2  = name2.replaceAll("[^0-9]", "&");
        System.out.println(replaceAll2);
        System.out.println("");
		System.out.println("**********************************************************");
		//subString method-based on start index
        String d = "Amazon have launched new product";
        String substring = d.substring(5);
        System.out.println(substring);
        System.out.println("");
		System.out.println("**********************************************************");
	    //subString method-based on start index and end index
        String d2 = "Amazon have launched new product";
        String substring2 = d2.substring(2, 6);
        System.out.println(substring2);
        System.out.println("");
		System.out.println("**********************************************************");
        //toLowerCase
        String val="jAVA";
        String lowerCase = val.toLowerCase();
        System.out.println(lowerCase);
        System.out.println("");
		System.out.println("**********************************************************");
        //toUpperCase
        String upperCase = val.toUpperCase();
        System.out.println(upperCase);
        System.out.println("");
		System.out.println("**********************************************************");
		//string to paerse
		String price="39487347";
		int data = Integer.parseInt(price);
		
        
	}
}
