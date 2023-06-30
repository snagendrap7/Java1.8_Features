package Features;

import java.util.ArrayList;
import java.util.function.Consumer;

public class forEach {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		Consumer<Integer> c=i->{
			System.out.println(i*i);
		};
		a.stream().forEach(c);

	}

}
