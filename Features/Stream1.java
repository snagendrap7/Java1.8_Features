package Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		
		long noofStudnetsFailed=l.stream().filter(m->m>=35).count();
		System.out.println(noofStudnetsFailed);
		
        List<Integer> n =l.stream().map(m->m+5).collect(Collectors.toList());
        System.out.println(n);
        
        List<Integer>
 
	}

}
