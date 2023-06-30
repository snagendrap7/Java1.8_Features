package Features;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDate {

	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(2002, 07, 01);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);
		System.out.printf("your gae is%d months and %d days",p.getYears(),p.getMonths(),p.getDays());

	}

}
