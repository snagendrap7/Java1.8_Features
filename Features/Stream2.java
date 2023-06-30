package Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("Sunny");
		l.add("Kajal");
		l.add("Prabas");
		l.add("Anushka");
		l.add("Mallika");
		System.out.println(l);
		
//		List<String> m=l.stream().sorted((l1,l2)->l2.compareTo(l1)).collect(Collectors.toList());
//      List<String> m=l.stream().sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> m=l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(m);

	}

}
