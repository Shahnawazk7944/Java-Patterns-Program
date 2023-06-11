package Practice_02;

import java.awt.desktop.AboutHandler;
import java.util.Scanner;

public class PatternProg_2 {

	public static void main(String[] args) {
		
//		   *
//		  **
//		 ***
//		****
//		
//		And
//		
//		****
//		 ***
//		  **
//		   *
		
//		And

//		   *
//		  **
//		 ***
//		****
//		 ***   here upper loop print 4 lines and bottom loop print 3 lines
//		  **
//		   *
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows Do You Want?");
		int rows = sc.nextInt();
		
		
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//end
			System.out.println();
		//start
			
		
			for(int i=1;i<=rows;i++) {
				for(int j=1; j<=i-1;j++) {
					System.out.print(" ");
				}
				for(int k=i; k<=rows; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
			
			//end
			System.out.println();
			//start
			
			
			
			for(int i=1;i<=rows;i++) {
				
				for(int j=rows-1;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
				for(int i=1;i<rows;i++) {
					
					for(int j=1; j<=i;j++) {
						System.out.print(" ");
					}
					for(int k=i; k<=rows-1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			
		
		


	}

}
