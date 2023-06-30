package Features;

public class MultiThreadingWithLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
		};
		Thread t=new Thread(r);
		t.join();
		t.start();
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}

	}

}
