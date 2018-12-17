
public class Main {

	public static void main(String[] args) {
		Animal any=new Penguin("Any");
		Dog dog=new Dog("Alaja");
		dog.breathe();
		dog.eat();

		Parrot bird1=new Parrot("Burgut");
		bird1.fly();
		
		Penguin bird2=new Penguin("Pengi");
		bird2.fly();
		
		Bird par=new Penguin("Par");
		par.fly();
		any.fly();
	}

}
