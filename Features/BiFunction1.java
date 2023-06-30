package Features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Worker{
	int eno;
	String name;
	Worker(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
}
public class BiFunction1 {

	public static void main(String[] args) {
		ArrayList<Worker> a=new ArrayList<Worker>();
		BiFunction<Integer, String , Worker> f=(eno,name)->new Worker(eno,name);
		a.add(f.apply(100,"durga"));
		a.add(f.apply(200, "ravi"));
		a.add(f.apply(300,"nagi"));
		a.add(f.apply(400, "naooo"));
		
		for(Worker l:a) {
			System.out.println("employee eno"+l.eno);
			System.out.println("employee name"+l.name);
			System.out.println();
			
		}
	}

}
