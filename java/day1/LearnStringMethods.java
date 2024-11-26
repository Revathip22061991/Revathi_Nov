package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String Declaration
    String name="Testleaf";
    String comName=new String("Testleaf");
    //To print the length of the String-length()
    int textlength = name.length();
    System.out.println("Length of the String: "+ textlength);
    //To print the character position of the String-charAt()
    char charValue = name.charAt(4);
    System.out.println("CharAt() index of 4"+charValue);
    //To compare two string values-equals()
    String d="Testleaf";
    if(name.equals(d)) {
    	System.out.println("Value is equal");
    }
    else
    {
    	System.out.println("Value is not equal");
    }
	
    //To compare the memory address-"=="
	if(name==comName) {
		System.out.println("==");
	}
	else {
		System.out.println("!=");
	}
	//To print the string values by ignoring the case-equalsIgnoreCase
	String a="Testleaf";
	if(a.equalsIgnoreCase(d)) {
		System.out.println("Equals Ignore Case done");
	}
	else {
		System.out.println("Equals Ignore Case not done");
	}
	//To check the contains-contains()
	String j="Selenium";
	boolean contains=j.contains("ele");
	System.out.println(contains);
	
    //To convert String to character array-toCharArray()
	String n="Aksharan";
	char[] ch=n.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
		
	}

	}
}

