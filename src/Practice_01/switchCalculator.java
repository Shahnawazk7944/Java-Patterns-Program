package Practice_01;
import java.util.*;

public class switchCalculator {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter your first number ");
		int firstNumber = sc.nextInt();
		System.out.println("Plz enter what operation u wnat to perform like +, -, *, /, ");
		String operation = sc.next();
		System.out.println("Plz enter your second number ");
		int secondNumber = sc.nextInt();
		
		int result;
		switch(operation) {
		
		case "+" : result = firstNumber + secondNumber;
		System.out.println("your addition is "+ result);
		break;
		
		case "-" : result = firstNumber - secondNumber;
		System.out.println("your substraction is "+ result);
		break;
		
		case "*" : result = firstNumber * secondNumber;
		System.out.println("your multiplication is "+ result);
		break;
		
		case "/" : result = firstNumber / secondNumber;
		System.out.println("your division is "+ result);
		break;
		
		default  : System.out.println("invalid operation");
		}
		
		
	}
}
