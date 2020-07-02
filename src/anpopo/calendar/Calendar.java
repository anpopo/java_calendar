package anpopo.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일    월    화    수    목    금   토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		// 반복 횟수 입력 받기
		System.out.println("반복횟수를 입력하세요.");
		Scanner repeat = new Scanner(System.in);
		int reps = repeat.nextInt();
		
		Calendar cal = new Calendar();
		
		
		// 반복하는 횟수만큼 달을 입력 받기 
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String[] months = new String[reps];
		
		for (int i = 0; i < reps; i++) {
			months[i] = scanner.next();
		}
		
		
		// 해당하는 월 출력하기
		for (String month : months) {
			
			int c = Integer.parseInt(month);
			
			if (c < 13 && c > 0) {
				System.out.printf("%d월은  %d일 까지 있습니다.%n", c, cal.getMaxDaysOfMonth(c));
			} else {
				System.out.printf("야이노무자슥아 %d월은 달력에 없다.\n", c);
			}
		}

	}
}
