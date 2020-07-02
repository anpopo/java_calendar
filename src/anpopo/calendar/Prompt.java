package anpopo.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		// 메소드 사용을 위한 인스턴스 생성
		Calendar cal = new Calendar();
		// 반복해서 입력받기

		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			Scanner scanner = new Scanner(System.in);
			int month = scanner.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("Have a nice day~~");
				break;
			}
			cal.printCalendar(2017, month);
		}

	}

	public static void main(String[] args) {
		// 셀 실행
		
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
