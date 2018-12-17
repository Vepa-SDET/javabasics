import java.util.*;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan();
	}
	public static void scan() {
		Scanner scanner= new Scanner(System.in);
			
		System.out.println("Enter a short value");
		short s1=scanner.nextShort();
	
		System.out.print("Enter a string");
		String input=scanner.next();
		
//		scanner.nextLine();
		
		System.out.println("Enter an integer value");
		int i1=scanner.nextInt();
		
		System.out.println("Enter a boolean");
		boolean b1=scanner.nextBoolean();
		
		System.out.println("input= "+ input+" short "+s1+" integer "+i1+" boolean "+b1);
		scanner.close();
	}
}
