
public class Assignment_2 {

	public static void main(String[] args) {
		// Ass_2
		System.out.println(isCatPlaying(true, 10)); // false
		System.out.println(isCatPlaying(false, 36)); // false
		System.out.println(isCatPlaying(false, 35)); // true

		// Ass_3
		printMegaBytesAndKiloBytes(2050);

		// Ass_4
		System.out.println(bark(true, 1));
		System.out.println(bark(false, 2));
		System.out.println(bark(true, 8));
		System.out.println(bark(true, -1));

		// Ass_5
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));

		// Ass_6
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));

		// Ass_7
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));

	}

	public static boolean isCatPlaying(boolean bool, int temp) {
		if (!bool && temp >= 25 && temp <= 35) {
			return true;
		} else if (bool && temp >= 25 && temp <= 45) {
			return true;
		} else {
			return false;
		}
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int megaBytes = 0, remainder = 0;
		remainder = kiloBytes % 1024;
		megaBytes = (kiloBytes - remainder) / 1024;
		System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
	}

	public static boolean bark(boolean barking, int hourOfDay) {
		if (hourOfDay > 0 && hourOfDay < 23) {
			if (hourOfDay < 8 && barking) {
				return true;
			} else if (barking && hourOfDay > 22) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public static boolean hasEqualSum(int a, int b, int c) {
		if (a + b == c) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
			return true;
		} else {
			return false;
		}
	}

}
