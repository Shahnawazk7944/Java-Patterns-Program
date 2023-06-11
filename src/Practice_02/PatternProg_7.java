package Practice_02;

import java.util.Scanner;

public class PatternProg_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type how many rows you want?");
		int rows = sc.nextInt();
		
		for(int i = 0;i<rows;i++) {
			for(int j=0; j<rows; j++) {
				if(i==j || i+j == rows-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
