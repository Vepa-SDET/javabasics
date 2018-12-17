
public class Main {

	public static void main(String[] args) {
		Car bmw=new Car("M5", 5, 4, "bi-turbo", "white");
		bmw.setModel("X5");
		System.out.println(bmw.getModel()+"|"+bmw.getEngine());
	}

}
