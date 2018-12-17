
public class Main {

	public static void main(String[] args) {
//		Engine e1 = new Engine();	//optional way for composition relation between two classes
		Honda pilot= new Honda("red", 200, new Engine());
		pilot.carInfo();
		pilot.startHonda();
		pilot.stopHonda();
		
//		e1.start();
//		e1.stop();

	}

}
