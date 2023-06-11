package Practice_02;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class PatternProg_5 {
	
//	 ***************
//	  *************
//	   ***********
//	    *********
//	     *******
//	      *****
//	       ***
//	        *

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type how many rows you want?");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++) {
			
			for(int space=1;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j = rows; j>=i; j--) {
				System.out.print("*");
			}
			for(int k=rows-1;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		// Another Method
		
		
		
	for(int i = 1; i<=rows; i++) {
			
			for(int space=1;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j = (rows*2); j>=(i*2); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
