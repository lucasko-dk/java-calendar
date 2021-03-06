package honex.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompt() { 
		//숫자 입력받아 그달의 최대일수 출력
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) { 
			System.out.print(PROMPT);
			int mon = scanner.nextInt();
			if (mon==-1) { 
				break;
			} 
			if (mon>12) { 
				continue;
			}
//			System.out.printf("%d 월의 최대 일수는 %d 입니다. \n", mon, cal.getMaxDaysOfMonth(mon));
			cal.printCalendar(2020, mon);
		}
		
		System.out.println("Bye!!" );	
        scanner.close();
		
	}

	public static void main(String[] args) {
		
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}
}
