package anpopo.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public int getLeapMaxDayOfMonth(int month) {
		return LEAP_MAX_DAYS[month - 1];

	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년  %3d월>>   %n", year, month);
		System.out.println("  일    월    화    수    목    금   토");
		System.out.println("---------------------");
		if ((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
			int leapMaxDay = getLeapMaxDayOfMonth(month);
			for (int i = 1; i <= leapMaxDay; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0) {
					System.out.println();
				} else if (i == leapMaxDay) {
					System.out.println();
				}
			
			}

		} else {
			int maxDay = getMaxDaysOfMonth(month);
			
			for (int i = 1; i <= maxDay; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0) {
					System.out.println();
				} else if (i == maxDay) {
					System.out.println();
				}
			
			}

		}
		
	}

	
}
