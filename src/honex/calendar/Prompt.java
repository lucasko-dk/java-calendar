package honex.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT_YEAR="YEAR> ";
	private final static String PROMPT_MONTH="MONTH> ";
	
	public void runPrompt() { 
		//숫자 입력받아 그달의 최대일수 출력
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) { 
			System.out.print(PROMPT_YEAR);
			int year = scanner.nextInt();
			System.out.print(PROMPT_MONTH);
			int mon = scanner.nextInt();
			if (mon==-1) { 
				break;
			} 
			if (mon>12) { 
				continue;
			}
//			System.out.printf("%d 월의 최대 일수는 %d 입니다. \n", mon, cal.getMaxDaysOfMonth(mon));
			cal.printCalendar(year, mon);
		}
		
		System.out.println("Bye!!" );	
        scanner.close();
		
	}

	public static void main(String[] args) {
		
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}
}
