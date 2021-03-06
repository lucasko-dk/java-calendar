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
	
	public void printSampleCalendar() { 
		System.out.println("월	화	수	목	금	토	일");
		System.out.println("--------------------------------------------------");
		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
		System.out.println(" 8	 9	10	11	12	13	14");
		System.out.println("15	16	17	18	19	20	21");
		System.out.println("22	23	24	25	26	27	28");
		System.out.println("29	30	31		      ");
	}
	
	
	public static void main(String[] args) {

		//숫자 입력받아 그달의 최대일수 출력
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수룰 입력하세요 " );
		int repeat = scanner.nextInt();
		
		for (int i=0 ; i <repeat ; i++ ) {
			System.out.println("월 입력 ? " );
//			String s1 = scanner.nextLine();
			int mon = scanner.nextInt();
			System.out.printf("%d 월의 최대 일수는 %d 입니다. \n", mon, cal.getMaxDaysOfMonth(mon));
			cal.printSampleCalendar();
		}
		System.out.println("Bye!!" );	
        scanner.close();
	}
	
}
