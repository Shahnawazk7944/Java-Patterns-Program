package Practice_01;
import java.util.*;

public class palindrom {
//	
//	after reversing no if no is same as original no then it is palindrom no like 141,121
//	
//	
//	
//	
//	
//	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type your number");
		int no = sc.nextInt();
		int tem = no;
		
		int rem, rev = 0;
		while(no != 0){
			rem = no%10;
			rev = rev*10+rem;
			no = no / 10;
		}
		if(tem==rev) {
		System.out.println(tem+" is Palindrom of " + rev);
	}else {
		System.out.println(tem+" is not Palindrom");
	}
		}
	
}
