
public class For_Each_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,200,63,144,99};
	sumArr(arr);
	maxArr(arr);
	
	}
	public static void sumArr(int [] array) {
		int sum=0;
		for(int i:array) {
			sum+=i;
		}
	System.out.println(sum);
	}
	public static void maxArr(int [] array) {
		
		int max=array[0];
		for(int i:array) {
			if(i>max) {
				max=i;
			}
		}
	System.out.println(max);
	}

}
