package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {  
		/*
		 		����ڰ� �Է��� ���ڿ��� 
		 		���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		 		// 65 122
		 */

		System.out.print("���� : ");
		String text = new Scanner(System.in).nextLine();
		//Scanner sc = new Scanner (System.in);
	//	System.out.println(test.length());
		boolean check = false;
		for (int i=0;i<text.length();i++) {
			char a = text.charAt(i);
			if(a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
				check = true;
			
			}		
			//System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // ���ĺ��ΰ�? �٤� ��ȣ
		}
		System.out.println(check);

		//boolean isAlp = true;
		

	}
}

