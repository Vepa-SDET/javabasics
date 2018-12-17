
public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayHighScorePosition("Mike", calclulateHighScorePosition(1500));
		displayHighScorePosition("John", calclulateHighScorePosition(900));
		displayHighScorePosition("Jack", calclulateHighScorePosition(400));
		displayHighScorePosition("Trump", calclulateHighScorePosition(50));
	}

	public static void displayHighScorePosition(String name, int pos) {
		System.out.println(name + " managed to get into position " + pos + " on the high score table");
	}

	public static int calclulateHighScorePosition(int n) {
		if (n >= 1000) {
			return 1;
		} else if (n < 1000 & n >= 500) {
			return 2;
		} else if (n < 500 & n >= 100) {
			return 3;
		} else {
			return 4;
		}

	}
}
