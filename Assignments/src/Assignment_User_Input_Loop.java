import java.util.*;

public class Assignment_User_Input_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInput();
	}
//	Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
//	Before the user enters the number, print the message "Enter number"
//	If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
	
	
	public static void userInput() {
		Scanner scanner= new Scanner(System.in);
		int max=0,min=0,count=0;
		boolean bool=true; 
		while(bool) {
			count++;
			System.out.println("Enter a number:");
			try
	        {
			int num=scanner.nextInt();
			if(num>max) {
			   max=num;
			   if(count==1) {
				   min=num;
			   }
			}else if(min>num) {
				min=num;
			}
	        }
			catch (java.util.InputMismatchException e)
	        {
			System.out.println("Minimum number: "+min+" Maximum number: "+max);
			bool=false;
			}
			scanner.close();
		}
	         
	}
}

