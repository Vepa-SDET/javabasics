package List;
import java.util.*;
public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> values =new ArrayList<Integer>();
		values.add(5);
		values.add(10);
		values.add(1,9);
		values.add(2);
		
		
		values.remove(0);
		
//		Collections.sort(values);
	    System.out.println(values.size());
		System.out.println(values);
		
		for(int i: values) {	//for each loop
			System.out.println(i);
		}
	}
	
}
