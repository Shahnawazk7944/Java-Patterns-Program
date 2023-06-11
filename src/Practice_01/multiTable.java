package Practice_01;
import java.util.*;

public class multiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("plz enter which table u want?");
		int tabale = scanner.nextInt();
	
		for(int i=1; i<=10; i++) {
			System.out.println(tabale + " * " + i + " = " + tabale*i );
		}
	}

}
