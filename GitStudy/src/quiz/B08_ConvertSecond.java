package quiz;

import java.util.Scanner;

public class B08_ConvertSecond { // ���� ���� �ؾߵ� �����

	public static void main(String[] args) {

		/*
		 		�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		 		
		 		* �ʿ� ���� ������ ������� ����
		 		ex: 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� �� 
		 */
		
		
		
		System.out.print("�ʸ� �Է��ϼ��� : ");
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
		
		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� '%d�� %d�� %d�ð� %d�� %d��' �Դϴ� \n "
				, original, y, d, h, m, s);
		
		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� " , original);
		
		boolean exist = false;   //------->���� ������ �ٽ� �غ���
		
		if ( y != 0) {
			System.out.printf(y + "��");	
			exist = true;
		} if (d != 0) {
			System.out.printf(d + "��");
			exist = true;
		} if (h != 0) {
			System.out.printf(h + "�ð�");
			exist = true;
		} if (m != 0) {
			System.out.printf(m + "��");
		}
			System.out.printf(s + "���Դϴ�");
		}

		
		
		
		
//		
//		year = second / 365/ 8600;
//		day = second / 86400;
//		hour = second / 3600;
//		minute = second % 3600 / 60;
//		second = second % 3600 % 60;
//
//		if(year <=0)
//			System.out.println(year + "��" + day + "��" + hour + "�ð�"+ minute + "��" + second +"��" );
//		} else if(day < 0) 
//		System.out.printf("%d �� %d �ð� %d �� %d ��",day, hour, minute, second);

		
//		System.out.println(year + "��" + day + "��" + hour + "�ð�"+ minute + "��" + second +"��" );
		//System.out.printf("%d �� %d �� %d �ð� %d �� %d ��", year, day, hour, minute, second);
		
	
		

	
	
}

