
public class Assignment_Switch_Cases {

	public static void main(String[] args) {
		// Ass_11
		for(int i=0;i<8;i++) {
			printDayOfTheWeek(i);
		}
		//Ass_12
		for(int i=0;i<11;i++) {
			printNumberInWord(i);
		}
	}

	public static void printDayOfTheWeek(int day) {
		switch (day) {
		case 0:
		System.out.println("Sunday");
		break;
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		default:
		System.out.println("Invalid Day");
		break;

		}

	}
	
	public static void printNumberInWord(int number) {
		switch (number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;

		}
		
	}
}
