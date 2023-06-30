package Features;

import java.util.ArrayList;

public class toArray {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		Integer[] i=a.stream().toArray(Integer[]::new);
		//Integer:new()->it is integer object returns ,it is constructor reference.
		for(Integer i1:i) {
			System.out.println(i1);
		}
	}

}
