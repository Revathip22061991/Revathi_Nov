package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the Array
		int[] age= {30,23,12,45,89,25,43};
		//To print the age of index-0 ,1,2,3,4,5,6
		System.out.println("****************************************ARRAY VALUES*******************************************************************");
		System.out.println("Print the first value in the array:"+age[0]);
		System.out.println("Print the second value in the array:"+age[1]);
		System.out.println("Print the third value in the array:"+age[2]);
		System.out.println("Print the fourth value in the array:"+age[3]);
		System.out.println("Print the fifth value in the array:"+age[4]);
		System.out.println("Print the sixth value in the array:"+age[5]);
		System.out.println("Print the seventh value in the array:"+age[6]);
		System.out.println("*************************************LENGTH OF ARRAY*******************************************************************");
		//To print the length of the Array
		int length = age.length;
		System.out.println("The length of the Array is " + length);
		System.out.println("**************************************LAST VALUE IN THE ARRAY**********************************************************");
		//To print the last value in the Array
		System.out.println("The last value in the Array is " + age[length-1]);
		System.out.println("**************************************SORT THE ARRAY*******************************************************************");
		//To sort the Array
		Arrays.sort(age);
		//To print the age after sorting 
		System.out.println("Print the first value in the array:"+age[0]);
		System.out.println("Print the second value in the array:"+age[1]);
		System.out.println("Print the third value in the array:"+age[2]);
		System.out.println("Print the fourth value in the array:"+age[3]);
		System.out.println("Print the fifth value in the array:"+age[4]);
		System.out.println("Print the sixth value in the array:"+age[5]);
		System.out.println("Print the seventh value in the array:"+age[6]);
		System.out.println("***************************************SORT THE ARRAY IN ASCENDING ORDER***********************************************");
		//To print all the values in the array in ascending order using for loop
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);}
		System.out.println("*************************************SORT THE ARRAY IN DESCENDING ORDER***********************************************");
		//To print all the values in the array in descending order using for loop
			for (int j = age.length-1; j >=0; j--) {
				System.out.println(age[j]);
			}
			}
		

		
	}

