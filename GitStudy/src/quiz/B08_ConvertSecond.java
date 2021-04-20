package quiz;

import java.util.Scanner;

public class B08_ConvertSecond { // 생각 많이 해야됨 어려움

	public static void main(String[] args) {

		/*
		 		초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
		 		
		 		* 필요 없는 단위는 출력하지 말것
		 		ex: 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함 
		 */
		
		
		
		System.out.print("초를 입력하세요 : ");
		int second = new Scanner(System.in).nextInt();
		
	
		final int SECOND_FOR_YEAR = 31536000;
		final int SECOND_FOR_DAY = 86400;
		final int SECOND_FOR_HOUR = 3600;
		final int SECOND_FOR_MINUTE = 60;

		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		int original = second;
		y = second / SECOND_FOR_YEAR;
		second %= SECOND_FOR_YEAR;
		
		d = second / SECOND_FOR_DAY;
		second %= SECOND_FOR_DAY;
		
		h = second / SECOND_FOR_HOUR;
		second %= SECOND_FOR_HOUR;
		
		m %= SECOND_FOR_MINUTE;
		second %= SECOND_FOR_MINUTE;
		
		s = second;
		
		System.out.printf("'%d'초는 변환하면 '%d년 %d일 %d시간 %d분 %d초' 입니다 \n "
				, original, y, d, h, m, s);
		
		System.out.printf("'%d'초는 변환하면 " , original);
		
		boolean exist = false;   //------->사진 찍어놨음 다시 해보기
		
		if ( y != 0) {
			System.out.printf(y + "년");	
			exist = true;
		} if (d != 0) {
			System.out.printf(d + "일");
			exist = true;
		} if (h != 0) {
			System.out.printf(h + "시간");
			exist = true;
		} if (m != 0) {
			System.out.printf(m + "분");
		}
			System.out.printf(s + "초입니다");
		}

		
		
		
		
//		
//		year = second / 365/ 8600;
//		day = second / 86400;
//		hour = second / 3600;
//		minute = second % 3600 / 60;
//		second = second % 3600 % 60;
//
//		if(year <=0)
//			System.out.println(year + "년" + day + "일" + hour + "시간"+ minute + "분" + second +"초" );
//		} else if(day < 0) 
//		System.out.printf("%d 일 %d 시간 %d 분 %d 초",day, hour, minute, second);

		
//		System.out.println(year + "년" + day + "일" + hour + "시간"+ minute + "분" + second +"초" );
		//System.out.printf("%d 년 %d 일 %d 시간 %d 분 %d 초", year, day, hour, minute, second);
		
	
		

	
	
}

