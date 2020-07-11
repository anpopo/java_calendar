package anpopo.calendar;

import java.util.Scanner;


public class Prompt {
	// @week  요일명
	// 
	public int parseDay(String week) {
		if (week.equals("SU")) return 0;
		else if (week.equals("MO")) return 1;
		else if (week.equals("TU")) return 2;
		else if (week.equals("WE")) return 3;
		else if (week.equals("TH")) return 4;
		else if (week.equals("FR")) return 5;
		else if (week.equals("SA")) return 6;
		else return 0;
		
		
	}
	
	
	
	


	public void runPrompt() {
		// 메소드 사용을 위한 인스턴스 생성
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		int weekday = 0;
		
		
		
		// 반복해서 입력받기
		while (true) {
			System.out.println("연도를 입력하세요(exit : -1)");
			System.out.print("YEAR > ");
			int year = scanner.nextInt();
			
			if (year == -1) {
				System.out.println("Have a nice day~~");
				break;
			}
			
			System.out.println("월을 입력하세요.(exit : -1)");
			System.out.print("MONTH > ");
			int month = scanner.nextInt();
			
			if (year == -1) {
				System.out.println("Have a nice day~~");
				break;
			}
			
			
			System.out.println("첫번쨰 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)" );
			System.out.print("Weekday > ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			System.out.println();

			
			cal.printCalendar(year, month, weekday);
		}

	}

	public static void main(String[] args) {
		// 셀 실행
		
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
