package Practice_01;
import java.util.*;

public class facto {
	int Fact = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("plz enter a number");
		int fac = scanner.nextInt();
		
		
		facto factr = new facto();
		int result = factr.factorial(fac);
		System.out.println("your factoril is " + result);
		
		
//		for(int i = fac; i>=1; i--) {
//			Fact = Fact*i;
//		}
//		System.out.println("your factoril is " + Fact);
	}
	
	
	
	int factorial(int num) {
		if(num>1) {
			Fact = Fact*num;
			factorial(num - 1);
		}
		return Fact;
	}

}
