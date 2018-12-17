
public class BranchingStatements {

	public static void main(String[] args) {
		int score1=5000;
		if(score1==5000) {
			System.out.println("Your score is 5000");
		}
		
		int score2 =4000;
		if(score2==5000) {
			System.out.println("Your score is 5000");
		}else {
			System.out.println("Your score is not 5000");
		}
		
		int score3=5000;
		if(score3<5000 && score3>1000) {
			System.out.println("Your score is less than 5000 but greater than 1000");
		}else if(score3<1000) {
			System.out.println("Your score is less than 1000");
		}else {
			System.out.println("none of them");
		}
	}

}
