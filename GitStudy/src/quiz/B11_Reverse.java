package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {

		/*
		 		����ڰ� ������ �Է��ϸ� �Ųٷ� ���
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ� >");
		String word = sc.next();
		
		for(int i = word.length()-1 ; i >= 0; --i) {
			System.out.printf("�Ųٷ� ����ϸ� %s �Դϴ� .\n", word.charAt(i));
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
