
public class ArithmeticOperators {

	public static void main(String[] args) {
		//+ plus operator 
		int i1=12;
		int i2=5;
		float f1=15.5f;
		double d1=20.5;
		String msg="Hello";
		
		int res1=i1+i2;
		float res2=i1+f1;
		int res3=(int)(i2+d1); // casting the data type from double to integer 
		String res4=msg+f1;
		System.out.println(res1+" | "+res2+" | "+res3+" | "+res4);
		
		/*
		 * The result of expression involving anything integer-sized or  smaller variable is always an integer. 
		 * If you add two bytes together, you will get an integer. 
		 * And in case of arithmetic addition, multiplication, subtraction and division of
		 * integral variables (bytes or short) compile processes the value as integer, so you need to cast it.  
		*/
		
		System.out.println((byte)(130+19));
		
		
	}

}
