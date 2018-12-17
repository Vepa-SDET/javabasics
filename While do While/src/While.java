public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(128));
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(32125));
		System.out.println("==============");
		System.out.println(summDigits(128));
		System.out.println(summDigits(125));
		System.out.println(summDigits(-125));
		System.out.println(summDigits(32125));
	}

	public static int sumDigits(int num) {
		int sum = -1;
		if (num >= 10) {
			sum = 0;
			String str = String.valueOf(num);
			String[] arr = str.split("");
			int i = 0;
			while (i < arr.length) {
				sum += Integer.parseInt(arr[i]);
				i++;

			}
		}
		return sum;
	}

	public static int summDigits(int number) {

		if (number < 10) {
			return -1;
		}

		int sum = 0;
		while (number > 0) {
			int digit = number % 10; // 125%10 = 5 //12%10=2 //1%10=1
			sum = sum + digit; // 0+5=5 //5+2=7 //7+1=8
			number = number / 10; // 125/10=12 //12/10=1 //1/10=0

		}
		return sum;
	}

}