package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {  
		/*
		 		사용자가 입력한 문자열에 
		 		알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
		 		// 65 122
		 */

		System.out.print("문자 : ");
		String text = new Scanner(System.in).nextLine();
		//Scanner sc = new Scanner (System.in);
	//	System.out.println(test.length());
		boolean check = false;
		for (int i=0;i<text.length();i++) {
			char a = text.charAt(i);
			if(a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
				check = true;
			
			}		
			//System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // 알파벳인가? 붙ㅇ 괄호
		}
		System.out.println(check);

		//boolean isAlp = true;
		

	}
}

