
public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name="Bubbly";
		dog1.age=5;
		dog1.breed="Poodle";
		dog1.color="White";
		
		System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
				
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		System.out.println("====================================");
		
		Dog dog2 = new Dog();
		dog2.name="Basar";
		dog2.age=5;
		dog2.breed="Kangal";
		dog2.color="Brown";
		
		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
				
		dog2.bark();
		dog2.eat();
		dog2.wagTail();
		System.out.println("====================================");
		
		Dog2 dog = new Dog2("Trump",15,"Moodle","Black");
//		dog.name="Trump";
//		dog.age=15;
//		dog.breed="Moodle";
//		dog.color="Black";
		
		System.out.println(dog.name+":"+dog.age+":"+dog.breed+":"+dog.color);
				
		dog.bark();
		dog.eat();
		dog.wagTail();
		System.out.println("====================================");
		
	}
	}


