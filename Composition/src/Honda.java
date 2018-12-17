
public class Honda extends Car {	// is a relationship 
	private Engine engine;			// has a relationship  Composition is has a relationship

	public Honda(String color, int maxSpeed,Engine engine) {
		super(color, maxSpeed);
		this.engine=engine;
		
	}
	public void startHonda() {
		engine.start();
	}
	public void stopHonda() {
		engine.stop();
	}
	
	
}
