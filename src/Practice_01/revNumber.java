package Practice_01;
import java.util.*;

public class revNumber {
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
		System.out.println(tem+"'s reverse is " + rev);
	}
}
