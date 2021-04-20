package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String[] args) {
	
		/*
				입력 받은 문자열에 숫자가 포함되어 있으면 result가 1
				다른 문자가 포함되어 있다면 result가 0
		 */
		
		System.out.print("문자 : ");
		String text = new Scanner(System.in).nextLine();
		
		int result = 0;
		for (int i = 0; i < text.length(); i++) {
			char a = text.charAt(i);
			if('0' < a && a <'9') {
				result = 1;
			}
			//	System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // 알파벳인가? 붙ㅇ 괄호
		}
		System.out.println(result);

		
	}

}
