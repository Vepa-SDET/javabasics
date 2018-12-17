import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		useArray();
//		ArrayClass();
		System.out.println(getAverage(getIntegers(5)));
	}
	
	public static void useArray() {
		String [] arrString= {"Mike","Smith","1980"};
		int [] arrNumber= {5,6,7,8};
		arrNumber[3]=100;
		arrString[0]="Nancy";
		System.out.println(arrNumber[3]+" "+arrString[0]);
		System.out.println(arrString.toString());
		
	}
	
	public static void ArrayClass() {
		int [] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2= {1,20,30,4,5};
		
		System.out.println(myIntArray[2]+"|"+myIntArray2[4]);
		
	}
	
	public static int[] getIntegers(int number) {
		int [] myReturnArr = new int[number];
		Scanner scanner= new Scanner(System.in);
		int count=0,num=0;
	while(count<number) {
		System.out.println("Enter a number " + (count+1) + ":");
		boolean bool=scanner.hasNextInt();
		if(bool) {
			num=scanner.nextInt();
			myReturnArr[count]=num;
			count++;

		}else {
			System.out.println("Invalid Number");
			
		}
	
	}
	return myReturnArr;
	}
	
	public static double getAverage(int[] arr) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}

}