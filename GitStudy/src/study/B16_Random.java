package study;
import java.util.Random;

public class B16_Random {

	public static void main(String[] args) {
		
		/*
		 		# java���� ������ ���� �����ϱ�
		 		
		 		1. Math.random()
		 		
		 			- double Ÿ���� ���� �Ҽ��� �����Ѵ�,
		 		 	- �� ���� �Ҽ��� �̿��Ͽ� ���ϴ� ������ ���ڸ� ���� �� �ִ�.
		 		 	
		 		 	�� ���ϴ� ������ ���ڸ� ����� ���� (ex: 30 ~ 60)
		 		 	
		 		 		(1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ� (31��)
		 		 			0 * 31 <= x < 1 * 31
		 		 		(2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		 		 			(0 * 31 + 30 <= x < 1 * 31 + 30)
		 		 		(3) �Ҽ��� �Ʒ��� �����Ѵ�
		 		 			-> Math.floor() �Ǵ� int�� Ÿ�� ĳ����
		 */
		
//		for (int i = 0; i < 10; ++i) {
//			System.out.println((int)(Math.random() * 31 + 30));
//		}
		
		// �������� : 1 ~ 45�� ���� ���ڸ� 7�� ���
	
		for (int i = 0; i < 7; ++i) {
			System.out.println((int)(Math.random() * 45 + 1));
	}
		
		/*
		 		2. Random Ŭ����
		 		
		 			- �� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ����
		 			- ������ �� ���� �õ尡 �����ȴ�
		 			- ���ϴ� ���� �õ带 ������ ���� �ִ�
		 */
		
		System.out.println("-------------------------");
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random();
		
		// # random.nextInt(bound)
		// - 0 ~ bound �̸��� ������ ��ȯ�Ѵ�
		
		System.out.println(ran.nextInt(45) + 1);	// 1 ~ 45�� ���� ����
		System.out.println(ran.nextInt(41) + 30);	// 30 ~ 70�� ���� ����
		System.out.println(ran.nextInt(5)+1);

		
		// #randon.nexrBoolean()
		//	- Random Ŭ������ ���ϴ� Ÿ���� ���� ���� ���� ���� �� �ִ�.
		System.out.println(ran.nextBoolean() ? "��" : "��");
		
		
		
	}
}
