package Features;

public class NonStaticClass {
   
	public static void main(String[] args) {
		
		Nonstatic nonstatic=new Nonstatic();
		Nonstatic.innerclass name=nonstatic.new innerclass();
		
	}
}

class Nonstatic{
	static int a=10;
	private int b=20;
	private static int c=30;
	
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	class innerclass{
	     void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}

}
