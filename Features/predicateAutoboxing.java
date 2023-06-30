package Features;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class predicateAutoboxing {

	public static void main(String[] args) {
//		Function<Integer, Integer> f=i->i*i;
//		System.out.println(f.apply(4));//4 will be convert into Integer
        //int-->Integer(f<Integer,Integer>-->int(i*i)-->Integer
		
//		IntFunction<Integer> f1=i->i*i;
//		System.out.println(f1.apply(4));
//		--------------------------------------------
//		ToIntFunction<String> f=s->s.length();
//		System.out.println(f.applyAsInt("durga"));
//		     //(or)
//		Function<String, Integer> f1=s->s.length();
//		System.out.println(f1.apply("durga"));
//		--------------------------------------------
	
		Function<Integer, Double> f=i->Math.sqrt(i);
		System.out.println(f.apply(5));
		            //(or)
		IntToDoubleFunction f1=i->Math.sqrt(i);
		System.out.println(f1.applyAsDouble(5));
		
		
	}

}
