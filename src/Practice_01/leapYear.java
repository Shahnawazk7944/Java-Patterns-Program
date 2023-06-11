package Practice_01;
import java.util.*;

public class leapYear {

	public static void main(String[] args) {
		Scanner yr = new Scanner(System.in);
		System.out.println("Please Enter any year");
		int year = yr.nextInt();
	
		
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("year " + year + " is leap year");
		}else {
			System.out.println("year " + year + " is not leap year");
		}

	}

}
