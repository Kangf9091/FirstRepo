package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String[] args) {
	
		/*
				�Է� ���� ���ڿ��� ���ڰ� ���ԵǾ� ������ result�� 1
				�ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0
		 */
		
		System.out.print("���� : ");
		String text = new Scanner(System.in).nextLine();
		
		int result = 0;
		for (int i = 0; i < text.length(); i++) {
			char a = text.charAt(i);
			if('0' < a && a <'9') {
				result = 1;
			}
			//	System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // ���ĺ��ΰ�? �٤� ��ȣ
		}
		System.out.println(result);

		
	}

}
