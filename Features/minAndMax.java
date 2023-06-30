package Features;

import java.util.ArrayList;
import java.util.Comparator;

public class minAndMax {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(5);
		l.add(2);
		System.out.println(l);
		int a=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
	    System.out.println(a);
	    int b=l.stream().min((i,j)->j.compareTo(i)).get();
	    System.out.println(b);
	}

}
