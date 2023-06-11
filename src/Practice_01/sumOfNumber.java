package Practice_01;

import java.util.Scanner;

public class sumOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type your 1st number");
		int no1 = sc.nextInt();
		System.out.println("type your 2nd number");
		int no2 = sc.nextInt();
		
		int tem =0; int c;
		for(int i=no1; i<=no2; i++) {
			
			c = tem+i;
			System.out.println(c);
			tem=c;
			
		}

	}

}
