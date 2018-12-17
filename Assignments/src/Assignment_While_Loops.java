//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Sample Output:
//isPalindrome(-1221) - > should return true
//isPalindrome(707) - > should return true
//isPalindrome(11212) - > should return false because reverse is 21211 and that is not equal to 11212
//
//Hint:
//What is a Palindrome number? A palindrome number is a number which when reversed is equal to the original number.
//For example: 121, 12321, 1001 etc
//
//Logic to check a palindrome number:
//Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//If both are the same then the number is a palindrome otherwise it is not.
//
//Logic to reverse a number:
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//Extract the last digit to some variable say lastDigit = num % 10
//Increase the place value of reverse by one.
//To increase place value multiply reverse variable by 10 e.g reverse = reverse * 10
//Add lastDigit to reverse
//Since last digit of num is processed, remove last digit of num. To remove last digit divide num by 10
//Repeat steps until num is not equal to (or greater than) zero.
//

public class Assignment_While_Loops {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221)); // should return true
		System.out.println(isPalindrome(707)); // should return true
		System.out.println(isPalindrome(11212)); // should return false because reverse is 21211 and that is not equal to 11212
		
		System.out.println(getEvenDigitSum(123456789)); 				//should return 20 since 2+4+6+8=20.
		System.out.println(getEvenDigitSum(252));				 		//should return 4 since 2+2=4.
		System.out.println(getEvenDigitSum(-22));						//should return -1 since the number is negative.	
	}

	public static boolean isPalindrome(int number) {
		boolean bool = true;
		int num = number;
		int x = 0;
		String y = "";

		while (bool) {
			if (num < 0) {
				num = -1 * num;
				number = number * -1;
			}
			if (num > 0) {
				x = num % 10;
				num = (int) Math.floor(num / 10);
				y += Integer.toString(x);
			} else if (num == 0) {
				bool = false;

			}
		}
		if (number == Integer.valueOf(y)) {
			return true;
		} else {
			return false;
		}

	}

//	Write a method named getEvenDigitSum with one parameter of type int called number. 
//	The method should return the sum of the even digits within the number. 
//	If the number is negative, the method should return -1 to indicate an invalid value.

public static int getEvenDigitSum(int num) {
	int n = num;
	int sum = 0;
	if(num<0) {
		return -1;
	}else {
	while(num!=0) {
		n=num%10;
		if(n%2==0) {
			sum+=n;
		}
		num=(int) Math.floor(num/10);
	}
	return sum;
	}
}
			
			
	

}
