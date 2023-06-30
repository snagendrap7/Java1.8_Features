package Features;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOpertor1 {

	public static void main(String[] args) {
		BinaryOperator<Integer> f=(i1,i2)->i1*i2;
		System.out.println(f.apply(10, 20));
               //(or)
		IntBinaryOperator f2=(i1,i2)->i1*i2;
		System.out.println(f2.applyAsInt(10, 20));
	}

}
