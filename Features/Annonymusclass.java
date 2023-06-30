package Features;

 class Annonymusclass {

//	public static void main(String[] args) {
//		Runnable r=new Runnable()
//	     {
//			public void run() {
//				for(int i=0;i<=10;i++) {
//					System.out.println("i love u");
//				}	
//			      }
//				};
//         Thread t=new Thread(r);
//         t.start();
//         for(int i=0;i<=10;i++) {
//        	 System.out.println("main thread");
//	}
//
//	}
	
	int i;
	int j;
	public Annonymusclass() {
		i=1;
		j=2;
	}
	
}
 public class output{
	public static void main(String[] args) {
		Annonymusclass obj1=new Annonymusclass();
		System.out.println(obj1.toString());
	}
}
