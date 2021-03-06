package honex.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int intWeekDay(String weekday) {
		switch (weekday) {
		case "SU":
			return (0);
		case "MO":
			return (1);
		case "TU":
			return (2);
		case "WE":
			return (3);
		case "TH":
			return (4);
		case "FR":
			return (5);
		case "SA":
			return (6);
		default:
			return (-1);
		}
	}

	private static Boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static int getMaxDaysOfMonth(int year, int mon) {

//		switch(mon) { 
//		case 1 :
//			return 31;
//		case 2 : 
//			return 28;
//		default : 
//			return 30;
//		}
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[mon - 1];
		} else {
			return MAX_DAYS[mon - 1];
		}
	}

	public void printCalendar(int year, int month, int weekdayint) {

		int cnt=0;
		System.out.println("weekday int=> " + weekdayint);
		System.out.printf("<< %4d년%3d월 >> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int j = 0; j < weekdayint; j++) {
			System.out.print("   ");
		}
		
		cnt = weekdayint+1;
				
		for (int i = 0; i < getMaxDaysOfMonth(year, month) ; i++) {
				System.out.printf("%3d", i + 1);
				if ((cnt) % 7 == 0) {
					System.out.println();
					cnt=0;
				}
				cnt++;
		}	

//		for (int i = 0; i < getMaxDaysOfMonth(year, month); i++) {
//			System.out.printf("%3d", i + 1);
//			if ((i + 1) % 7 == 0) {
//				System.out.println();
//			}
//		}
		System.out.println("\n");
//		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
//		System.out.println(" 8	 9	10	11	12	13	14");
//		System.out.println("15	16	17	18	19	20	21");
//		System.out.println("22	23	24	25	26	27	28");
//		System.out.println("29	30	31		      ");
	}

}
