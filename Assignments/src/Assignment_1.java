
public class Assignment_1 {

	public static void main(String[] args) {
		int[] incomes = { 150000, 200000, 250000, 300000, 400000, 500000, 750000, 900000, 1250000 };
		double taxAmount = 0;
		for (int i = 0; i < incomes.length; i++) {
			if (incomes[i] > 0) {

				if (incomes[i] <= 150000) {
					taxAmount = incomes[i] * 0.25;
					System.out.println("Your Income :" + incomes[i]);
					System.out.println("The tax amount you have to pay:" + taxAmount);
				} else if (incomes[i] <= 300000) {
					taxAmount = 150000 * 0.25 + (incomes[i] - 150000) * 0.30;
					System.out.println("Your Income :" + incomes[i]);
					System.out.println("The tax amount you have to pay:" + taxAmount);
				} else if (incomes[i] <= 600000) {
					taxAmount = 150000 * 0.25 + 150000 * 0.30 + (incomes[i] - 300000) * 0.35;
					System.out.println("Your Income :" + incomes[i]);
					System.out.println("The tax amount you have to pay:" + taxAmount);
				} else if (incomes[i] <= 1200000) {
					taxAmount = 150000 * 0.25 + 150000 * 0.30 + 300000 * 0.35 + (incomes[i] - 600000) * 0.40;
					System.out.println("Your Income :" + incomes[i]);
					System.out.println("The tax amount you have to pay:" + taxAmount);
				} else if (incomes[i] > 1200000) {
					taxAmount = 150000 * 0.25 + 150000 * 0.30 + 300000 * 0.35 + 600000 * 0.40
							+ (incomes[i] - 1200000) * 0.50;
					System.out.println("Your Income :" + incomes[i]);
					System.out.println("The tax amount you have to pay:" + taxAmount);
				}
			} else {
				System.out.println("The income amount must be greater than 0");
			}
		}
	}
}
