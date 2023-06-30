package Features;

import java.time.LocalDateTime;
import java.time.Month;

public class BeforeAndAfterDate {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1995,Month.JULY,12,10,45);
		System.out.println(dt);
        System.out.println("After six months date:"+dt.plusMonths(6));
        System.out.println("Befor six months date:"+dt.minusMonths(6));
	}

}
