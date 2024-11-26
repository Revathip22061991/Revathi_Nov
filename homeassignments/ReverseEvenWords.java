package week3.homeassignments;

import java.util.Arrays;

public class ReverseEvenWords {
    public static void main (String[]args)
    {
    	String test="I am a software tester";
    	System.out.println("Input"+" "+test);
    	String[] t = test.split(" ");

    	String value = "";
    	for (int i = 0; i < t.length; i++) {

    	    if (i % 2 == 1)
    	        value = value + new StringBuilder(t[i]).reverse().toString() + " ";
    	    else
    	        value = value + t[i] + " ";
    	}
    	//value = value.trim();
    	System.out.println("Output"+" "+value);
    }
}