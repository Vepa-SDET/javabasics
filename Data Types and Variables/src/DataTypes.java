
public class DataTypes {

	public static void main(String[] args) {
		// byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;
		System.out.println(b1+"|"+b2+"|"+b3);
		System.out.println("----------------------------------------------------");
		
		//short
		short s1=128;
		short s2=-32768;
		short s3=32767;
		System.out.println(s1+"|"+s2+"|"+s3);
		System.out.println("----------------------------------------------------");
		
		//int
		int i1=-50000;
		int i2=100_000;
		int i3=100_000_000;
		System.out.println(i1+"|"+i2+"|"+i3);
		System.out.println("----------------------------------------------------");
		
		//long
		long l1=100_000_000; 		// if it is in the integer limit we do NOT need to put l or L
		long l2=2_147_839_494_031l; // if it is not in the integer limit we need to put l or L
		System.out.println(l1+"|"+l2);
		System.out.println("----------------------------------------------------");
		
		//float: floating point types have double as default type
		
		float f1=5.2f;
		double d1=5.2;
		System.out.println(f1+"|"+d1);
		System.out.println("----------------------------------------------------");
		
		//boolean 
		boolean bool1=true;
		boolean bool2=false;
		System.out.println(bool1+"|"+bool2);
		System.out.println("----------------------------------------------------");
		
		//char
		char c1='d';
		char c2='r';
		char c3='x';
		char c4='\u00A9';
		System.out.println(c1+"|"+c2+"|"+c3+"|"+c4);
		System.out.println("----------------------------------------------------");
		
	}

}
