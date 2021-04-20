package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		
		/*
		 		사과를 10개씩 담을 수 있는 바구니가 있다.
		 		
		 		사용자가 구매하고 싶은 사과의 개수를 입력하면
		 		사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
		 		
		 */
		Scanner sc = new Scanner (System.in);
		
//		 System.out.print("사과의 개수를 입력하세요 > ");
//		 int apple_count = sc.nextInt();
//		 
//		 
//		 int apple_box = apple_count / 10;
//		 
//		if(apple_box % 10 == 0) {
//		System.out.println("필요한 바구니 개수 : " + apple_box);
//		} else if (apple_box % 10 !=0) {
//		System.out.println("필요한 바구니 개수: " + (apple_box + 1));
//		} else if (apple_count <= 0)
//		System.out.println("사과를 담을 수 없습니다");
		
 
		 //--------------------------------------------------------------------------
		 
		int apple;
		int size = 10;
		 
		System.out.print("구매하고 싶은 사과의 개수 >>");
		apple = sc.nextInt();
		
		
//		if (apple < 0) {
//			System.out.println("잘못된 사과의 개수입니다.");
//		} else if(apple % size !=0) {
//			 System.out.println(" 필요한 바구니의 개수 : " + (apple / size +1));
//		 } else {
//			 System.out.println("필요한 바구니의 개수 : " + apple / size);
//		 }
		 
		 
		 
		 if (apple < 0) {
			 System.out.println("잘못된 개수를 입력하셨습니다.");
		 } else {
			 	System.out.println("필요한 바구니의 개수 : " + (int)Math.ceil(apple / (double) size));
		 }
		
		 
	 
 	}

}


