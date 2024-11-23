package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************DUPLICATE VALUES USING NESTED FOR LOOP***************************************");
		int[] num= {23,54,67,12,45,90,23,12};
		//Outer For loop
		for (int i = 0; i < num.length; i++) {
			//Inner for loop
			for (int j=i+1;j < num.length; j++) {
				
				if (num[i]==num[j])
					
				{
					System.out.println("Duplicate values: "+ num[i]);
				}
				
			}
		}
		
		System.out.println("****************DUPLICATE VALUES USING SINGLE FOR LOOP************************************************************************");
			
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-1; i++) {
			
			if(num[i]==num[i+1]) {
				
				System.out.println("Duplicate Values:"+num[i]);
			}
		}
		}			
		}
	