package anpopo.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

//		System.out.println("일    월    화    수    목    금   토");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		int[] monthList = new int[3];
		
		monthList[0] = 28;
		monthList[1] = 30;
		monthList[2] = 31;
		
		
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int a = Integer.parseInt(str);
		if (0 < a && a < 13) {
			switch(a) {
				case 1:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 2:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[0]);
					break;
				case 3:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 4:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[1]);
					break;
				case 5:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 6:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[1]);
					break;
				case 7:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 8:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 9:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[1]);
					break;
				case 10:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
				case 11:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[1]);
					break;
				case 12:
					System.out.printf(("%d월은 %d일까지 있습니다."), a, monthList[2]);
					break;
					
			}
		} else {
			System.out.println("월을 잘못 입력하셨습니다.");
			
		}
	}
}
 