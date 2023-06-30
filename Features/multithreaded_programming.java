package Features;

class newthread extends Thread
{
	newthread()
	{
		super("My tHread");
	}
	public void rum() {
		System.out.println(this);
	}
}
public class multithreaded_programming {

	public static void main(String[] args) {
		new newthread();

	}

}
