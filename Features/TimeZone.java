package Features;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/losAngles");
		ZonedDateTime dt=ZonedDateTime.now(la);
		System.out.println(dt);

	}

}
