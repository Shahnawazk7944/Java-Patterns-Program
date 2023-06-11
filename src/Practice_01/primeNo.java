package Practice_01;
import java.util.*;
public class primeNo {
	
	// the numbers which divide by 1 and itself;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type your number");
		int no = sc.nextInt();
		
		int tem = 0;
		for(int i=2; i<=no-1;i++) {
			if(no%i==0) {
				tem = tem +1;
			}
			
		}
		if(tem>0) {
			System.out.println(no+" is not Prime");
		}else{
			System.out.println(no+" is Prime");
		}
		
	}

}
