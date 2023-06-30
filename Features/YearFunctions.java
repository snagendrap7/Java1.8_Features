package Features;

import java.time.Year;
import java.util.Scanner;

public class YearFunctions {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the year");
		int yyyy=scn.nextInt();
		Year y=Year.of(yyyy);
		if(y.isLeap()) {
			System.out.println("it is leap year"+yyyy);
		}
		else {
			System.out.println("it is not a leap year"+yyyy);
		}

	}

}
