package Practice_01;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiDesktopIconUI;

public class armStrongNumber {
	
	//armStrongNumber is 
//		1=1p1
//		12=1p1+2p2
//		153=1p1+5p5+3p3 == 153 then it amrStron
//		
//		some armStrong no are 0,1,153,370,371,407,1634

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Type the no of which u find ArmStrong");
		int no = sc.nextInt();
		int t1 = no;
		int len = 0;
		
		while(t1 != 0) {
			t1 = t1/10;
			len = len+1;
		}
		int t2 = no;
		int arm = 0;
		
		while(t2!=0) {
			int multi = 1;
			int rem = t2%10;
			for(int i=1; i<=len;i++) {
				multi = multi * rem;
		}
			arm = arm + multi;
			t2 = t2/10;
			

	}
		if(arm==no) {
			System.out.println("Your given no "+no+ " is ArmStrong");
		}else {
			System.out.println("Your given no "+no+ " is not ArmStrong");
		}

}
	}
