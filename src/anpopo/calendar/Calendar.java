package anpopo.calendar;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public int getLeapMaxDayOfMonth(int month) {
		return LEAP_MAX_DAYS[month - 1];

	}

	public void checkTheFirstDay(String weekday) {
		if (weekday.equals("SU")) {
		}
		if (weekday.equals("MO")) {
		}
		if (weekday.equals("TU")) {
		}
		if (weekday.equals("WE")) {
		}
		if (weekday.equals("TH")) {
		}
		if (weekday.equals("FR")) {
		}
		if (weekday.equals("SA")) {
		}

	}

	public void printCalendar(int year, int month, int weekday) {
		String dayList = "  일    월    화    수    목    금   토";
		System.out.printf("    <<%4d년  %3d월>>   %n", year, month);
		System.out.println(dayList);
		System.out.println("---------------------");
		
		int count = 7 - weekday;
		int tmp = 0;
		
		
		
		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
			
		}
		
		// print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		// print second line to last
		for (int i = (count + 1); i <= getMaxDaysOfMonth(month); i++ ) {
			System.out.printf("%3d", i);
			tmp++;
			if (tmp % 7 == 0) {
				System.out.println();
			}
			
		}
		System.out.println();
		
		
		
		// print second line to last

//		if ((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
//			int leapMaxDay = getLeapMaxDayOfMonth(month);
//			for (int i = 1; i <= leapMaxDay; i++) {
//				System.out.printf("%3d", i);
//				if (i % count == 0) {
//					System.out.println();
//				}
//				
////				if (i % 7 == 0) {
////					System.out.println();
////				} else if (i == leapMaxDay) {
////					System.out.println();
////				}
//
//			}
//
//		} else {
//			int maxDay = getMaxDaysOfMonth(month);
//
//			for (int i = 1; i <= maxDay; i++) {
//
//				System.out.printf("%3d", i);
//				if (i % count == 0) {
//					System.out.println();
//				}
////				if (i % 7 == 0) {
////					System.out.println();
////				} else if (i == maxDay) {
////					System.out.println();
////				}
//
//			}
//
//		}

	}

}
