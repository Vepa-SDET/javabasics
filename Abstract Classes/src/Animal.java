
public abstract class Animal {
	
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void eat();			// abstract method
		
	public abstract void breathe();		// abstract method
		
	public String getName() {			//concrete method
		return name;
	}

	protected abstract void fly();
	
}
