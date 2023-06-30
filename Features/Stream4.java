package Features;

import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Stream4 {

	public static void main(String[] args) {
		Stream s=Stream.of(8,88,888,8888,88888);
		s.forEach(System.out::println);
	}

}
