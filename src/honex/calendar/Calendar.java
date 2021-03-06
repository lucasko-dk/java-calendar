package honex.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Calendar");

//		System.out.println("월	화	수	목	금	토	일");
//		System.out.println("--------------------------------------------------");
//		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
//		System.out.println(" 8	 9	10	11	12	13	14");
//		System.out.println("15	16	17	18	19	20	21");
//		System.out.println("22	23	24	25	26	27	28");
//		System.out.println("29	30	31		      ");
//		
		//숫자 입력받아 그달의 최대일수 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월 입력 ? " );
//		String s1 = scanner.nextLine();
		int mon = scanner.nextInt();
		
		int[] max_days = {31,28,31,30,31,30,31,31,30,31,30,31} ;
		
		System.out.printf("%d 월의 최대 일수는 %d 입니다.", mon, max_days[mon-1]);
		
				scanner.close();
		
		
	}

}
