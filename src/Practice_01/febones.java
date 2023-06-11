package Practice_01;

import java.util.Scanner;

public class febones {

	public static void main(String[] args) {
//		sommution of first two given no till the give  no.
//		
//		4 and 5 till 10. it will be like 4+5 then 5+6 then 6+7 then 7+8 then 8+9 then 9+10 .......
//		
//		
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("type your 1st number");
		int no1 = sc.nextInt();
		System.out.println("type your 2nd number");
		int no2 = sc.nextInt();
		System.out.println("Upto which no u want Fibonacc?");
		int no3 = sc.nextInt();
		
		int tem =0; int c;
		for(int i=no1; i<=no3; i++) {
			
			c = no1+no2;
			System.out.println(c);
			no1=no2;
			no2=c;
			
		}

	}

}
