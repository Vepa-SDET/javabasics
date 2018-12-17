
public class CalculateInterest {

	public static void main(String[] args) {
		// How much is the interest for the amount of 10000 USD and 2 % ineterest rate
		for (int i = 2; i <= 5; i++) {
			System.out.println(calculateInterest(10000, i));
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}

}
