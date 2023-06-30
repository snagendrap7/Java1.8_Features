package Features;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp{
	String name;
	double sal;
	public Emp(String name,double sal) {
		this.name=name;
		this.sal=sal;
	}
}
public class BiConsumer1 {

	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
		populate(l);
		BiConsumer<Emp, Double> c=(e,d)->e.sal=e.sal+d;
		for(Emp e:l) {
			c.accept(e, 500.0);
		}
		for(Emp e:l) {
			System.out.println("Emplotee Name:"+e.name);
			System.out.println("Employee Salary"+e.sal);
			System.out.println();
		}
		

	}
	public static void populate(ArrayList<Emp> l) {
		l.add(new Emp("durga",5000));
		l.add(new Emp("Sunny",4000));
		l.add(new Emp("bunny",2000));
	}

}
