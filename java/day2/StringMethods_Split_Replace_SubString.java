package week3.day2;

public class StringMethods_Split_Replace_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="String Methods";
		
		//Split method
		System.out.println("Split Method output:");
		String[] split = value.split("t");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		//Replace method
		System.out.println("\n\nReplace Method output:");
		String replace = value.replace('s', 'S');
		System.out.print(replace);
		//SubString method
		System.out.println("\n\nsubString Method output:");
		String substring = value.substring(3, 9);
		System.out.print(substring);
	}

}
