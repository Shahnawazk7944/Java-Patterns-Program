package Practice_02;

import java.util.Scanner;

public class PatternProg_3 {
//	    *
//	   * * 
//	  * * *
//	 * * * *
//	* * * * *

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Type how many rows you want?");
		int row = sc.nextInt();
		
		for(int i = 0; i<=row;i++) {
			for(int j=row-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			
			System.out.println(" ");
		}
		
		
 //Another Program
		for(int i = 0; i<=row;i++) {
			
			for(int j=row;j>=1;j--) {
				
			if(j>i){
				System.out.print(" ");
			}else {
				System.out.print(" *");
			}
			
		}System.out.println(" ");
	}

}
	
}
