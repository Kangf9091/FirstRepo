package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        
        �����ڵ�
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true    
        7. ����ڰ� �Է��� ���ڿ��� exit�� �� true    
*/        
		
		char a = 'q';
		char b = ' ';
		char c = '4';
		char d = 'D';
		char e = '��';
		char f = 'e';
		
		String user_input ;
		
		System.out.println("1. " + (a == 'q' || a== 'Q')); // �Ʒ� ��ȣ �� ���̱�
		System.out.println(b != ' ' && b != '\t');
		System.out.println('0' <= c && c <='9');
		System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // ���ĺ��ΰ�? �٤� ��ȣ
		System.out.println(e>=44032 &&  e<=55203);
		//System.out.println(e>='��' &&  e<='�R'); // 0xAC00 && 0xD7A3
		System.out.println(f >= 0x3040 && f <= 0x309F || f >= 0x30A0 && f <= 0x30FF); //��ȣ ���̱�
		
		System.out.print("�ƹ� �ܾ �Է��غ����� >");
		user_input = sc.next();
		System.out.println(user_input.equals("exit"));

		
	}

}
