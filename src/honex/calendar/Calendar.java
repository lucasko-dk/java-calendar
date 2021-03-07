package honex.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private HashMap< Date, PlanItem> planMap;
	
	public Calendar() { 
		planMap = new HashMap<Date, PlanItem>();
	}
	
	
	public PlanItem searchPlan(String strDate) {
		Date date = PlanItem.getDatefromstring(strDate);
		return planMap.get(date);
	}

	public void registerPlan(String strDate, String Plan) {
		PlanItem p = new PlanItem(strDate, Plan) ;
		planMap.put(p.getDate(),p);
		System.out.println("성공적으로 등록되었습니다..!!");
		
	}


//	public static void main(String[] args) {
//		Calendar calendar = new Calendar();
//		int result = calendar.getWeekDay(1970, 2,1);
//	}

	public static int getWeekDay(int year, int month, int day) {
		int sYear = 1970;
		int sMonth = 1;
		int sDay = 0;
		final int STANDARD_WEEKDAY = 3; // 1970/1/1 = thursday

		// year day
		if (year - sYear > 0) {

			for (int i = 0; i < year - sYear; i++) {

				if (isLeapYear(year - i - 1)) {
					sDay = sDay + 366;
				} else {
					sDay = sDay + 365;
				}
			}

		}

		// month day

		for (int i = 0; i < month-1; i++) {
			if (isLeapYear(year)) {
				sDay = sDay + LEAP_MAX_DAYS[i];
			} else {	
				sDay = sDay + MAX_DAYS[i];
			}
		}
		
		//day
		sDay=sDay+day;
		
		int weekday ; 
		//week day 
		if (year==1970 && month==1) { 
			weekday = STANDARD_WEEKDAY;
		} else {  
			weekday = (sDay) % 7;
			weekday = weekday+(STANDARD_WEEKDAY-1);
		}	
		
		if (weekday==7) { weekday=0; }
		return weekday;
	}

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

		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[mon - 1];
		} else {
			return MAX_DAYS[mon - 1];
		}
	}

	public void printCalendar(int year, int month, int weekdayint) {

		int cnt = 0;
		System.out.printf("<< %4d년%3d월 >> \n", year, month);
		System.out.println(" MO TU WE TH FR SA SU");
		System.out.println("---------------------");

		for (int j = 0; j < weekdayint; j++) {
			System.out.print("   ");
		}

		cnt = weekdayint + 1;

		for (int i = 0; i < getMaxDaysOfMonth(year, month); i++) {
			System.out.printf("%3d", i + 1);
			if ((cnt) % 7 == 0) {
				System.out.println();
				cnt = 0;
			}
			cnt++;
		}

		System.out.println("\n");
//		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
//		System.out.println(" 8	 9	10	11	12	13	14");
//		System.out.println("15	16	17	18	19	20	21");
//		System.out.println("22	23	24	25	26	27	28");
//		System.out.println("29	30	31		      ");
	}

}
