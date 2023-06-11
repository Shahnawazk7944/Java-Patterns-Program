package Practice_01;

import java.util.Scanner;

public class swapANumber {
	public static void main(String[] args) {
		Scanner yr = new Scanner(System.in);
		System.out.println("Please Enter first no");
		int a = yr.nextInt();
		System.out.println("Please Enter second no");
		int b = yr.nextInt();
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		System.out.println("your first swap to " + a);
		System.out.println("your second number swap to " + b);
	}

}
