package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		// ����ڷκ��� ���� �µ��� �Է� ������
		// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		// (��ȯ ������ ���� �˻�, ����� �Ҽ� ù° �ڸ�����)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���� �µ��� �Է��ϼ��� > ");	
		int cel = sc.nextInt();
		
		double fah = cel * 1.8 + 32;
		
		System.out.println(Math.round(fah * 10) / 10.0 + "��F");
		
		System.out.printf("���� �µ� %d��C�� ȭ�� �µ��� ��ȯ�ϸ� %.1f��F �Դϴ�" , cel , fah);

		
		
//		System.out.print("����(��) �µ��� �Է��ϼ��� > ");	
//		
//		double cel;
//		double fahr;
//		
//		fahr = (cel * 9/5) + 32;
// 		
//		System.out.printf("%.1f�ɴ� %.1f�� �Դϴ�.\n " , cel , fahr);
		

	}

}
