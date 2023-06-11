package Practice_02;

import java.util.Scanner;

public class PatternProg_4 {
	
//    *
//   ***
//  *****
// *******
//*********

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type how many rows you want?");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++) {
			for(int j =rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int l=2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Another Method
		
		for(int i = 1; i<=rows; i++) {
			for(int j =rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
