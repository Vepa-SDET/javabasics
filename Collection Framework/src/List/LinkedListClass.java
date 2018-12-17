package List;

import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> object= new LinkedList<String>();

		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2,"E");
		object.add("F");
		object.add("G");
		
		System.out.println(object+" Size is:"+object.size());
		System.out.println(object.get(1));
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		
		LinkedList<Integer> obj= new LinkedList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(7);
		obj.add(10);
		
		obj.remove(1);
		System.out.println(obj);
		System.out.println(object+" Size is:"+object.size());
	
	}

}
