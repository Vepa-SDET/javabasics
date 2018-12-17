import java.util.*;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan();
	}
	public static void scan() {
		Scanner number=new Scanner(System.in);
		int count=1;
		int sum=0;
		int num;
		while(count<11) {
			System.out.println("Enter a number " + count + ":");
			boolean bool=number.hasNextInt();
			if(bool) {
				num=number.nextInt();
				sum=sum+num;
				count++;

			}else {
				System.out.println("Invalid Number");
				
			}
				number.nextLine();

		}		System.out.println(sum);
				number.close();
	}
}
