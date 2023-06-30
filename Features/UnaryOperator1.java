package Features;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;

public class UnaryOperator1 {

	public static void main(String[] args) {
		IntUnaryOperator f1=i->i+1;
		System.out.println(f1.applyAsInt(4));
		
		IntUnaryOperator f2=i->i+1;
		System.out.println(f2.applyAsInt(4));
		
		System.out.println(f1.andThen(f2).applyAsInt(4));
		

	}

}
