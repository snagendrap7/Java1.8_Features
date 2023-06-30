package Features;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class DataAndTime1 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
    
	}

}
