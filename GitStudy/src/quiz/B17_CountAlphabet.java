package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 		사용자로부터 문장을 하나 입력받고
		 		해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		 		(대소문자 구분없이 셀것)
		 */
		String text = "AbCzzfz";
		
		// # 문자열을 쉽게 대문자 또는 소문자로 변환하기
		text = text.toUpperCase(); // /toLower 소문자
		
		int[] count = new int[26];
		
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
	   }
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				System.out.println((char)(i+65) + "의 개수 : " + count[i]);
				System.out.println((char)(i + 'A') + " :  " + count[i]);
			}
		}
	}
}
