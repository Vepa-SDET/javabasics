
public class StaticMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc.show1();
		Abc x=new Abc();
		x.show2();
		x.show1();
	}

}

class Abc{
	public static void show1() {				//Static Method
		System.out.println("Hello_1");
		show4();
	}
	public  void show2() {						//Instance Method
		System.out.println("Hello_2");
		show1();
		
	}
	public void show3() {
		System.out.println("Hello_3");
		show2();
	}
	public static void show4() {
		System.out.println("Hello_4");
		
	}
}