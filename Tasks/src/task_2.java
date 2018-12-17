
public class task_2 {

	public static void main(String[] args) {
		// for if statements
		int marks =100;
		if(marks>=0 && marks<60) {
			System.out.println("Fail");
		}else if(marks>=60 && marks<90) {
			System.out.println("Pass");
		}else if(marks>=90 && marks<=100 ) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Mark must be an integer between 0-100!");
		}

	}

}
