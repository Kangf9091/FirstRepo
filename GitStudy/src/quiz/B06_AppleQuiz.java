package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		
		/*
		 		����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		 		
		 		����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		 		����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
		 		
		 */
		Scanner sc = new Scanner (System.in);
		
//		 System.out.print("����� ������ �Է��ϼ��� > ");
//		 int apple_count = sc.nextInt();
//		 
//		 
//		 int apple_box = apple_count / 10;
//		 
//		if(apple_box % 10 == 0) {
//		System.out.println("�ʿ��� �ٱ��� ���� : " + apple_box);
//		} else if (apple_box % 10 !=0) {
//		System.out.println("�ʿ��� �ٱ��� ����: " + (apple_box + 1));
//		} else if (apple_count <= 0)
//		System.out.println("����� ���� �� �����ϴ�");
		
 
		 //--------------------------------------------------------------------------
		 
		int apple;
		int size = 10;
		 
		System.out.print("�����ϰ� ���� ����� ���� >>");
		apple = sc.nextInt();
		
		
//		if (apple < 0) {
//			System.out.println("�߸��� ����� �����Դϴ�.");
//		} else if(apple % size !=0) {
//			 System.out.println(" �ʿ��� �ٱ����� ���� : " + (apple / size +1));
//		 } else {
//			 System.out.println("�ʿ��� �ٱ����� ���� : " + apple / size);
//		 }
		 
		 
		 
		 if (apple < 0) {
			 System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
		 } else {
			 	System.out.println("�ʿ��� �ٱ����� ���� : " + (int)Math.ceil(apple / (double) size));
		 }
		
		 
	 
 	}

}


