//Write a method names sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and last digit of the parameter number passed to the method, using a loop and return the sum of the first and last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.
//
//Sample Output:

public class Assignment_15_Loops {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252)); 	//should return 4, first digit 2 and the last is 2 which gives us 2+2 and the sum is 4
		System.out.println(sumFirstAndLastDigit(257)); 	//should return 9, first digit 2 and the last is 9 which gives us 2+7 and the sum is 9
		System.out.println(sumFirstAndLastDigit(0)); 	//should return 0, first digit 0 and the last is 0 which gives us 0+0 and the sum is 0
		System.out.println(sumFirstAndLastDigit(5)); 	//should return 10, first digit 5 and the last is 5 which gives us 5+5 and the sum is 10
		System.out.println(sumFirstAndLastDigit(-10)); 	//should return -1, because the parameter is negative

	}
	
	public static int sumFirstAndLastDigit(int num) {
		if(num>=0) {
			String str=Integer.toString(num);
			String [] arr=str.split("");
			return (Integer.valueOf(arr[0])+Integer.valueOf(arr[arr.length-1]));
		}else {
			return -1;
		}
		
	}

}
