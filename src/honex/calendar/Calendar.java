package honex.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31} ;
	
	public static int getMaxDaysOfMonth(int mon) { 
		
//		switch(mon) { 
//		case 1 :
//			return 31;
//		case 2 : 
//			return 28;
//		default : 
//			return 30;
//		}
		return MAX_DAYS[mon-1];
	}
	
	public void printCalendar(int year, int month) { 
		System.out.printf("<< %4d년%3d월 >> \n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		;
		for(int i=0; i<getMaxDaysOfMonth(month); i++) {
			System.out.printf("%3d",i+1);
			if((i+1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
//		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
//		System.out.println(" 8	 9	10	11	12	13	14");
//		System.out.println("15	16	17	18	19	20	21");
//		System.out.println("22	23	24	25	26	27	28");
//		System.out.println("29	30	31		      ");
	}
	

}
