package Practice_01;

public class Practice {
	public static void main(String[] args) {
		//System.out.print("Shahnawaz");
		
		int num = 29;
		byte byt = -32;
		char charch = 'S';
		
		long l = 34324324;
		short srt = 3432;
		
		float f = 4.5f;
		double d = 3.76666666666;
		
		boolean conditi = true;
		String name = "Shahnawaz khan";
		
		System.out.println("number = " + num + "\n" + "Byte = " + byt + "\n" + "Charcter = " + charch + "\n" + "Long = " + l + "\n" 
		+ "Short = " + srt + "\n" + "Float = " + f + "\n" 
		+ "Double = " + d + "\n" + "Condition = " + conditi + "\n" + "Name = " + name);
		
		
		// check for greater number
		
		int x = 45;
		int y = 20;
		int z = 50;
		
		if(x>y && x>z) {
			System.out.println("greater no is " + x);
		}else if(y>x && y>z){
			System.out.println("greater no is " + y);
		}else {
			System.out.println("greater no is " + z);
		}
		
		int i = 1;
		
		while(i<=4) {
			System.out.println("hi" + i);
			int j = 1;
			while(j<=2) {
				System.out.println("hello shahnawaz" + j);
				j++;
			}
			i++;
		}
		
		
		
	}
	
}