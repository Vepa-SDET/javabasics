
public class Car {
	private String model;
	private int doors;
	private int wheels;
	private String engine;
	private String color;

	public Car(String model, int doors, int wheels, String engine, String color) {
		super();
		this.model = model;
		this.doors = doors;
		this.wheels = wheels;
		this.engine = engine;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model.equals("X5")) {
			this.model = model;
		} else {
			System.out.println("Invalid model");
		}

	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
