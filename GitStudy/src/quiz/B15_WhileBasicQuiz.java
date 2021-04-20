package quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 		whlie문을 이용하여 다음을 구하시오.
		 		
		 		1. 1부터 100까지의 3의 배수의 총합
		 		
		 		2. 200부터 1까지 출력
		 		
		 		3. continue를 이용하여 300부터 500사이의 7의 배수만 출력
		 		
		 		4. 1부터 200까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
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
//		System.out.println("1부터 100까지 3배수의 합 = " + sum);
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
//		System.out.printf("총 합은 : %d", sum2);
	
	
		
		
		
		
		// 정답 =========================
		
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
	



