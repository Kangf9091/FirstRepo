package quiz;

import java.util.Scanner;

public class B11_Palindrome2 {
	public static void main(String[] args) {
		
		System.out.print("문자 : ");
		String word = new Scanner(System.in).nextLine();
		
		
		boolean palindrome = true;
		
		for (int i = 0 ,j = word.length() -1 ; i < word.length(); ++i, --j) {
			//System.out.printf("'%c' VS '%c' \n", word.charAt(i), word.charAt(j));
			
			if (word.charAt(i) != word.charAt(j)) {
				palindrome = false;
				break;
			}
			
		}
		System.out.println(palindrome ? "회문입니다." : "회문이 아닙니다.");
	}

}
