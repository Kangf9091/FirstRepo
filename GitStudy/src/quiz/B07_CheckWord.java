package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {                    
		/*
		 		����ڷκ��� �ܾ �ϳ� �Է¹ް� 
		 		ù ��° ���ڿ� ������ ��° ���ڰ� ���� ��ġ�ϸ� "OK" �� ���
		 		�ƴ϶�� "NOT OK"�� ����غ�����
		 */
		Scanner sc = new Scanner (System.in);
	
		// next() : ���� �ܾ StringŸ������ �޾ƿ��� (���� \t ����)
		// nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n����)
		
		System.out.print("�ƹ��ų� �Է��غ����� >");
		String word = sc.next();

		if (word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("OK");
		}else
			System.out.println("NOT OK");
		}
}
