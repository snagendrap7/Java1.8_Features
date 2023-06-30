package Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class DateAndTime1 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int dd=dt.getDayOfMonth();
		int mm=dt.getMonthValue();
		int yy=dt.getYear();
		System.out.printf("DATE: %d-%d-%d",dd,mm,yy);
		int h=dt.getHour();
		int m=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();
		System.out.printfk("\nTime:%d-%d-%d-%d",h,m,s,n);

	}

}
