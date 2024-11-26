package week3.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String value ="Testleaf";
     char[] se = value.toCharArray();
     for (int i = se.length-1; i >= 0; i--) {
		System.out.print(se[i]);
	}
	}

}
