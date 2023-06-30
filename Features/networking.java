package Features;

import java.net.MalformedURLException;
import java.net.URL;

public class networking {

	public static void main(String[] args) throws MalformedURLException {
		URL obj=new URL("https://www.sanfoundary.com/javamcq");
		System.out.println(obj.toExternalForm());
	}

}
