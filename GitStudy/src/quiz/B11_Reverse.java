package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {

		/*
		 		사용자가 문장을 입력하면 거꾸로 출력
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 >");
		String word = sc.next();
		
		for(int i = word.length()-1 ; i >= 0; --i) {
			System.out.printf("거꾸로 출력하면 %s 입니다 .\n", word.charAt(i));
		}
	}
}
		
//		for (int i = 0; i < word.length() / 2; ++i) {
//			
//			char ch = word.charAt(i);
//			char ch2 = word.charAt(word.length() - i - 1);
//			
//			char tem;
//			tem =ch;
//			ch = ch2;
//			ch2 = tem;
//			
//		
//			
//}
//		System.out.println();
