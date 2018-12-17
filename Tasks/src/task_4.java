
public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFeetAndInchesToCentimeters(6, 0));
		System.out.println(calcFeetAndInchesToCentimeters(-10, 0));
		System.out.println(calcFeetAndInchesToCentimeters(0, 1));

		System.out.println(calcFeetAndInchesToCentimeters(100));
		System.out.println(calcFeetAndInchesToCentimeters(156));

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
		if (feet >= 0 && inch >= 0) {
			double centimeters = feet * 30.48 + inch * 2.54;
			return centimeters;
		} else {
			return -1;
		}

	}

	public static double calcFeetAndInchesToCentimeters(double inch) {
		if (inch >= 0) {
			double centimeters = inch * 2.54;
			return centimeters;
		} else {
			return -1;
		}
	}

}
