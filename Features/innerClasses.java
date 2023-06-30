package Features;

class OuterClass{
	static int a=10;
	private static int b=10;
	int c=10;
	public void display1() {
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
    static class StaticClass{
    	static int z=10;
    	int x=20;
    	void display() {
    		System.out.println(a);
    		System.out.println(b);
    		OuterClass outerClass=new OuterClass();
    		System.out.println(outerClass.c);
    	}
    }
}
public class innerClasses {

	public static void main(String[] args) {
		
		OuterClass.StaticClass Static=new OuterClass.StaticClass();
		Static.display();
		
        OuterClass class1=new OuterClass();
        class1.display1();
	}

}
