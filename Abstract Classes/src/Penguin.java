
public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(getName()+" can not fly");
		
	}

}
