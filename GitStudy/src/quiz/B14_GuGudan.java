package quiz;

public class B14_GuGudan {

	public static void main(String[] args) {

		/*
		 		1.�������� ������ ���� ���η� ����غ�����
		 		
		 		2�� : 2x1=2 2x2=4 2x3=6 ...
		 		3�� : 3x1=3 ....
		 		2. �������� ������ ���� ���η� ����غ�����
		 		
		 		2��			3��			4��
		 		2x1=2		3x1x3		4x1=4
		 */

//			for (int dan = 2; dan <= 9; ++dan) {
//
//				System.out.printf("\n%d�� :", dan);
//				for (int gop = 1; gop <= 9 ; ++gop) {
//					System.out.printf("\t%d x %d = %d\t" , dan, gop, dan * gop);
//			
//			}
//		}
//		System.out.println();
//		for (int i =2 ; i <= 9; i++)
//			System.out.printf("%d��\t\t\t" , i);
//			System.out.println();
//		for (int dan = 1; dan <= 9; ++dan) {
//			
//			for (int gop = 2; gop <= 9 ; gop++) {
//				
//				System.out.printf("%d x %d = %d\t\t" , gop, dan, gop * dan);
//				}System.out.println();
//			}
	
		for(int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf(dan + "�� :");
			
			for (int gop = 1; gop <= 9 ; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
	System.out.println("=====================================");
	
	for (int gop = 0; gop <= 9 ; ++gop) { // line�̶�� ����
		
		for (int dan = 2; dan <= 9; ++dan) {
			
			if (gop == 0) {
					System.out.println(dan + "��");
			}else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
			}
				
			
			System.out.printf("%dx%d=%d\t", dan , gop, gop * dan);
		}
		System.out.println();
	}
		
	
		
		
	
	}

}
