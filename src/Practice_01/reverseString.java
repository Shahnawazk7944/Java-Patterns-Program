package Practice_01;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Your String");
		String str = sc.nextLine();
		int length = str.length();
		
		String revSt = "";
		for(int i=length-1; i>=0; i--) {
			revSt = revSt + str.charAt(i);
			
			
		}
		System.out.println("Your Reverse String is " + revSt);
		

	}

}
