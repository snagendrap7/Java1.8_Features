package Features;

interface interf{
	public void add(int a,int b);
}
public class MethodReference1 {
	
	public static void sum(int x,int y) {
		System.out.println("the sum"+(x+y));
	}

	public static void main(String[] args) {
		interf i=(a,b)->System.out.println("The sum:"+(a+b));
		i.add(10, 20);
		
		interf i1=MethodReference1::sum;
		i1.add(100, 200);

	}

}
