package Practice_01;

import java.util.Scanner;

public class fiboByRecur {
	
	static int no1,no2,no3,tem,c;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type your 1st number");
		no1 = sc.nextInt();
		System.out.println("type your 2nd number");
		no2 = sc.nextInt();
		System.out.println("Upto which no u want Fibonacc?");
		no3 = sc.nextInt();
		tem = no1;
		fiboByRecur ob = new fiboByRecur();
		ob.fib(no3);
		
	}
	void fib(int no) {
		if(no>=tem) {
		c = no1+no2;
			System.out.println(c);
			no1=no2;
			no2=c;
			fib(no-1);
	}
		}

}
