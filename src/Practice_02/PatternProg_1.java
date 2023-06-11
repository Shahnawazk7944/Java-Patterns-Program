package Practice_02;

import java.awt.desktop.AboutHandler;
import java.util.Scanner;

public class PatternProg_1 {
	
//	*
//	**
//	***
//	****
	
//	And
	
//	****
//	***
//	**
//	*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows Do You Want?");
		int rows = sc.nextInt();
		
		for (int i = 1; i<=rows; i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		for (int i = 1; i<=rows; i++) {
			for (int j=rows;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	}

	

