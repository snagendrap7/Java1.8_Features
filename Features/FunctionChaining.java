package Features;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1=i->2*i;
		Function<Integer, Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));//first f1 then i=2 into i=4 after f2 then i=4 and i=64 
		System.out.println(f1.compose(f2).apply(2));// first f2 and f1 function is called.
	}

}
