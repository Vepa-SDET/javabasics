
// when a class extends an abstract class(Animal class) it becomes concrete class(Dog class)
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void eat() {							//concrete method overrides abstract method
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void breathe() {						//concrete method overrides abstract method
		System.out.println(getName()+" is breathing in & out");
		
	}

	@Override
	protected void fly() {
		// TODO Auto-generated method stub
		
	}

}
