
public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateSum(calcSum2(3, 5), calcSum2(19, 25));
		System.out.println(calcSum2(40, 32));
	}

	public static void calculateSum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static int calcSum2(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
