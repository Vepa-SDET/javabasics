
public abstract class  Bird extends Animal{

	public Bird(String name) {
		super(name);
		
	}

	@Override		//concrete method overrides abstract method
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override		//concrete method overrides abstract method
	public void breathe() {
		System.out.println(getName()+" is breathing in & out");
		
	}
	
	public abstract void fly();
	
}
