package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 		����ڷκ��� ������ �ϳ� �Է¹ް�
		 		�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		 		(��ҹ��� ���о��� ����)
		 */
		String text = "AbCzzfz";
		
		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		text = text.toUpperCase(); // /toLower �ҹ���
		
		int[] count = new int[26];
		
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
	   }
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				System.out.println((char)(i+65) + "�� ���� : " + count[i]);
				System.out.println((char)(i + 'A') + " :  " + count[i]);
			}
		}
	}
}
