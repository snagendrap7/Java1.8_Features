package Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(2);
		l.add(4);
		l.add(25);
		
		Comparator<Integer> comp=new Comparator<Integer>() {
		    @Override
			public int compare (Integer o1,Integer o2) {
			return o1-o2;
		}
		};
		
		Comparator<Integer> comp1=(o1,o2) -> o1-o2;
		
		Collections.sort(l,comp);
		Collections.sort(l,(o1,o2)->o1-o2);
		System.out.println(l);
	}

}

