package honex.calendar;

import java.util.Scanner;

/**
 * 
 * @author Lucas ko
 * # 입력된 월의 1일의 요일을 입력 받는다. 
 * # 입력받은 요일 부터 1일이 출력되어 말일까지 주별로 7일씩 출력되도록 작성.
 */

public class Prompt {
	
	private final static String PROMPT_YEAR="YEAR> ";
	private final static String PROMPT_MONTH="MONTH> ";
	private final static String PROMPT_WEEKDAY="WEEKDAY(SU,MO,TU,WE,TH,FR,SA)> ";
	
	public void runPrompt() { 
		//weekday를 입력받지 않고 자동계산하여 출력한다 
		//숫자 입력받아 그달의 최대일수 출력
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) { 
			System.out.print(PROMPT_YEAR);
			int year = scanner.nextInt();
			if (year == -1) {
				System.out.println("종료합니다.-EXIT");
				break;
			}
			System.out.print(PROMPT_MONTH);
			int month = scanner.nextInt();
			if (month<1 || month >12) { 
				System.out.println("잘못된 월을 입력했습니다");
				break;
			} 
			if (month>12) { 
				continue;
			}
			
			int weekdayint = 0;
//			System.out.print(PROMPT_WEEKDAY);
//			String weekday = scanner.next();
//			int weekdayint = cal.intWeekDay(weekday.toUpperCase());
//			if (weekdayint==-1) {
//				System.out.println("잘못된 요일을 입력했습니다");
//				break;
//			}
			
			weekdayint = cal.getWeekDay(year,month,1);
//			System.out.printf("%d 월의 최대 일수는 %d 입니다. \n", mon, cal.getMaxDaysOfMonth(mon));
			cal.printCalendar(year, month, weekdayint);
		}
		
		System.out.println("Bye!!" );	
        scanner.close();
		
	}

	public static void main(String[] args) {
		
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}
}
