package quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 		whlie���� �̿��Ͽ� ������ ���Ͻÿ�.
		 		
		 		1. 1���� 100������ 3�� ����� ����
		 		
		 		2. 200���� 1���� ���
		 		
		 		3. continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
		 		
		 		4. 1���� 200������ ������ 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		 */
		
//		int sum = 0;
//		int i = 0;
//        
//		while(++i <= 100) {
//			if(i % 3 == 0) {
//				
//				sum += i;
//			}
//		}
//		
//		System.out.println("1���� 100���� 3����� �� = " + sum);
//	
//		
//		int j = 201;
//				while(--j >=1 ) {
//					System.out.printf("%d\t",j);
//				}
//			System.out.println();
//
//		int a = 300;
//		while(++a <= 500) {
//			if(a % 7 !=0) {
//				continue;
//			}
//			System.out.printf("%d\t", a);				
//		}
//	System.out.println();
//
//		int b = 0;
//		int sum2 = 0;
//		while (++b <= 200) {
//			if(b % 2 != 0 && b % 3 != 0){
//				sum2 += b;
//			}
//		}
//		System.out.printf("�� ���� : %d", sum2);
	
	
		
		
		
		
		// ���� =========================
		
		int i = 0;
		int sum = 0;
		while (i++ < 100) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
			System.out.println(sum);
			System.out.println();
		
		i = 200;
		
		while(i > 0) {
			System.out.println(i--);
		}
			System.out.println();
	
			i = 299;
		while(++ i <= 500) {
			
			if (i % 7 != 0) {
				continue;
			}
			System.out.println(i);
		}
	
		i = 1;
		 sum = 0;
		
		while (i++ < 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			
			}
		}
		System.out.println(sum);
		
			
		
			}
		}
	



