package study;

import java.util.Scanner;
public class B03_Scanner {


//	Scanner sc = new Scanner(System.in); // ctrl + Shift + o\
		/*
		 		# Math Ŭ����
		 		
		 			-���а� ���õ� ��ɵ��� ���ִ� Ŭ����
		 			ex: abs(), round(), ceil(), ....
		 		
		 		
		 		
		 		# java.util.Scanner Ŭ����
		 		
		 		- ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
		 		- ��𿡼� �Է��� ������ �����ѵڿ� �پ��� ������ �Է� ������ �ִ�
		 		- �ַܼκ��� �Է� �ް� ���� ���� System.in�� ����Ѵ�
		 
		 */
		public static void main(String[] args) {
		
			// new Scanner(System.in);
			// System.in���κ��� �Է¹޴� ��ĳ�ʸ� �ϳ� ����
			
			// ScannerŸ�� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ��´�
			Scanner sc = new Scanner (System.in);
//			ex Scanner sc2 = new Scanner (new File("D://abc.txt"));
			
			// Scanner�� nextInt() 
			// -�������� ������ ������ �ϳ� ������
			// - �������� ���� ���� �ƹ��͵� ���� ���� �Է��� ��� ��ٸ���
			System.out.print("�� ������ �Է����ּ���(21�� ����) > ");
			 int a = sc.nextInt();
			 
			 System.out.println("�Է��Ͻ� ���� " + a + "�Դϴ�");
			 System.out.println("�Է��Ͻ� ���� 3�� ���ϸ� " + a * 3 + "�Դϴ�");
			 System.out.println("1000�� �Է��Ͻ� ���� ���̴� " +(1000 - a) + "�Դϴ�");
			 
			 // Scanner �� nextDouble(()
			 // - �������� ������ �Ǽ��� �ϳ� ������
			 // - �������� ���� ���� �ƹ��͵� ���� ���� �Է��� ��� ��ٸ���
			 
			 System.out.print("�̹����� �Ǽ��� �Է����ּ��� (������ ����) >");
			 double b = sc.nextDouble();
				
			System.out.println("�ι�°�� �Է��Ͻ� ���� " + b + "�Դϴ�.");
			System.out.println("ù ��° ���� �� ��° ���� ���ϸ� " + a * b + "�Դϴ�.");
		

	}

}
