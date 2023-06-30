package Features;

public class MethodReference {

	public  int m1() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread-1");
		}
		return 10;
	}
	
	public static void main(String[] args) {
		MethodReference m=new MethodReference();
		Runnable r=m::m1;
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main Thread-1");
		}

	}

}
