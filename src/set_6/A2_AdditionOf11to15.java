package set_6;

import java.util.ArrayList;
import java.util.Iterator;

public class A2_AdditionOf11to15 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
	
		System.out.println(sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		int result = 0;
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (num > 10) {
				result = result + num;
			}
		}
		return result;
	}
}
