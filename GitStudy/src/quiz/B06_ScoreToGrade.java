package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		
		/*
		 		������ �Է� ������ ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.

		 		 		90�̻� : A���
				 		80�̻� : B���
		 				70�̻� : C���
		 				60�̻� : D���
		 				�� �� : F���
		 				
		 			* ��ȿ�� ������ 0 ~ 100�� �Դϴ�.

*/
		
		// int score = 61;
		Scanner sc = new Scanner (System.in); 
		//int score = Scanner sc = new Scanner (System.in).nextInt();
		//char grade = 'F';
		//������ �����ؼ� �ٽ� ������ grade
		
		System.out.print("������ �Է��� �ּ��� > ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("�߸��� ���� �Դϴ�");
		} else if (score >= 90) {
			System.out.printf("%d�� A����Դϴ�\n",score);
		} else if (score >= 80) {
			System.out.println("B����Դϴ�");
		} else if (score >= 70) {
			System.out.println("C����Դϴ�");
		} else if (score >= 60) {
			System.out.println("D����Դϴ�");
		} else {
			System.out.println("F����Դϴ�");
		}
		System.out.println(); // %d %c �Դϴ�
 		
	
	}

}
