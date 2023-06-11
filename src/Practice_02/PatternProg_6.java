package Practice_02;

import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class PatternProg_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type how many rows you want?");
		int rows = sc.nextInt();

//		First Diagonal
//		*
//		 *
//		  *
//		   *
//		    *
//		     *

		for (int i = 1; i <= rows; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		System.out.println();
//		Second Diagonal
//	      *
//	     *
//	    *
//	   *
//	  *
//	 *
		for (int i = 1; i <= rows; i++) {

			for (int space = rows; space > i; space--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		
		
		System.out.println();
//		Third Diagonal
//	      *
//	     *
//	    *
//	   *
//	  *
//	 *
//	  *
//	   *
//	    *
//	     *
//	      *
		
		for (int i = 1; i <= rows; i++) {

			for (int space = rows; space > i; space--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 1; i <= rows-1; i++) {

			for (int space = 1; space <= i; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		
		
		
		System.out.println();
		// Forth Diagonal
//		*
//		 *
//		  *
//		   *
//		    *
//		   *
//		  *
//		 *
//		*
//	   *

		for (int i = 1; i <= rows; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 1; i <= rows; i++) {

			for (int space = rows - 1; space > i; space--) {
				System.out.print(" ");
			}
			if (rows != i) {
				System.out.println("*");
			}
		}  

		
		
		System.out.println();
//		Fifth Diagonal
//		
//		*       *
//		 *     *
//		  *   *
//		   * *
//		    *
		
		
		for (int i = 1; i <= rows; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			for (int j = (rows * 2); j >= (i * 2); j--) {
				
				if(j < (rows * 2) && j>=(i*2)+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		   
		
		
		System.out.println();
		//Sixth Diagonal
//	     *
//	    * *
//	   *   *
//	  *     *
//	 *       *
		
		for(int i = 1; i<=rows; i++) {
			for(int j =rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++) {
				if(k>1 && k<(i*2)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		 
		
		
		System.out.println();
//		Seventh Diagonal
//		*         *
//		 *       *
//		  *     *
//		   *   *
//		    * *
//		     *
//		     *
//		    * *
//		   *   *
//		  *     *
//		 *       *
//		*         *

		for (int i = 1; i <= rows; i++) {

			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			for (int j = (rows * 2); j >= (i * 2); j--) {
				
				if(j < (rows * 2) && j>=(i*2)+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 1; i<=rows; i++) {
			for(int j =rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++) {
				if(k>1 && k<(i*2)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		

	}

}
