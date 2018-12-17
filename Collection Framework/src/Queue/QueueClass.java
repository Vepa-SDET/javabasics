package Queue;

import java.util.*;
public class QueueClass {

	public static void main(String[] args) {

		Queue<Integer> q=new PriorityQueue<Integer>();
//		List <Integer> g = new ArrayList<Integer>();
		
		//Add elements
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		g.add(4);
		g.add(5);
		
		
		System.out.println(q);
		
//		int removedel=q.remove();
//		System.out.println(removedel);
//		System.out.println(q);
//		
		System.out.println(q.peek());
		
//		System.out.println(((Queue<Integer>) g).peek());
	}

}
