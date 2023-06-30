package Features;

import java.util.ArrayList;
import java.util.function.Predicate;

class employee{
	String name;
	float sal;
	public employee(String name, float sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
}

public class OPredicate {

	public static void main(String[] args) {
//		Predicate<Integer> p1=i->i%2==0;
//		System.out.println(p1.test(10));
				
		
//		Predicate<String> p1=s->s.length()>5;
//		System.out.println(p1.test("nage"));
		
//	    String[] a= {"nag","chiranjevi","venkat","bala","sunny","katri"};
//	    Predicate<String> p1=s->s.length()>5;
//	    for(String s:a) {
//	    	System.out.println(p1.test(s));
//	    }
	 	
		int[] x= {2,3,1,4,5,20,2,14,5,3,78};
		Predicate<Integer> i=e->e%2==0;
		Predicate<Integer> j=e->e>10;
		
		for(int k:x) {
			if(i.and(j).test(k))
				{
				System.out.println(k);
				}
		}
        

	
	
	}
}
