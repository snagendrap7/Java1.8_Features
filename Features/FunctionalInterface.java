package Features;

@FunctionalInterface
interface FunctionalInerface {

	public void m1();
	
	default void m2() {
		
	}
	public static void m3() {
		
	}
}
