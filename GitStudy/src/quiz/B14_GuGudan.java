package quiz;

public class B14_GuGudan {

	public static void main(String[] args) {

		/*
		 		1.구구단을 다음과 같이 가로로 출력해보세요
		 		
		 		2단 : 2x1=2 2x2=4 2x3=6 ...
		 		3단 : 3x1=3 ....
		 		2. 구구단을 다음과 같이 세로로 출력해보세요
		 		
		 		2단			3단			4단
		 		2x1=2		3x1x3		4x1=4
		 */

//			for (int dan = 2; dan <= 9; ++dan) {
//
//				System.out.printf("\n%d단 :", dan);
//				for (int gop = 1; gop <= 9 ; ++gop) {
//					System.out.printf("\t%d x %d = %d\t" , dan, gop, dan * gop);
//			
//			}
//		}
//		System.out.println();
//		for (int i =2 ; i <= 9; i++)
//			System.out.printf("%d단\t\t\t" , i);
//			System.out.println();
//		for (int dan = 1; dan <= 9; ++dan) {
//			
//			for (int gop = 2; gop <= 9 ; gop++) {
//				
//				System.out.printf("%d x %d = %d\t\t" , gop, dan, gop * dan);
//				}System.out.println();
//			}
	
		for(int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf(dan + "단 :");
			
			for (int gop = 1; gop <= 9 ; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
	System.out.println("=====================================");
	
	for (int gop = 0; gop <= 9 ; ++gop) { // line이라고 생각
		
		for (int dan = 2; dan <= 9; ++dan) {
			
			if (gop == 0) {
					System.out.println(dan + "단");
			}else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			}
				
			
			System.out.printf("%dx%d=%d\t", dan , gop, gop * dan);
		}
		System.out.println();
	}
		
	
		
		
	
	}

}
