package Practice_01;
import java.util.*;
public class primeNoTill100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type your number");
		int no = sc.nextInt();
		
		int tem = 0;
		
	for(int i=1 ; i<=no; i++) {
		for(int j=2; j<=i-1;j++) {
			if(i%j==0) {
				tem = tem +1;
			}
		}
		if(tem==0) {
			System.out.println(i+" is Prime");
		}else{
			tem=0;
		}
	}
		
		
	}

}
