package study;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
	 		# ����ǥ���� (Regular Expression)
	 		
	 			- ���ڿ��� ������ ǥ���ϴ� ǥ����
	 			- Ư�� ���α׷��� �� ���ӵ��� �ʴ´�
	 			- ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻��Ҷ� ����Ѵ�
	 			
	 		# Pattern Ŭ����
	 			
	 			- ����ǥ������ �ٷ�� Ŭ����
	 			
	 		# Matcher Ŭ����
	 		
	 			- ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 			
	 */
	public static void main(String[] args) {
		
		// Patten.matchs(regex, input) : input�� regex�� ��ġ�Ǵ� ���ڿ������� �˻����ִ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "speep")); // �̰� �ȵ�
		
		
		
		/*
		  		[] ���ο� ������ �� �ִ� �͵�
		  		
		  		1. abc 	: �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
		  		2. ^abc	: �ش� �ڸ��� abc�� ������ ������ ��� 
		  		3. a-z	: a ���� z���� ��� ���
		  		4. &&	: ������
		 */
		// 2��
		System.out.println(Pattern.matches("s[^lh@]eep", "s2eep"));
		
		// 3��
		System.out.println(Pattern.matches("s[1-9]eep", "s4eep"));
		System.out.println(Pattern.matches("s[1-9a-z]eep", "sleep"));
		
		// ������
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep")); //�ȵ�
		
		
		System.out.println("=-----------------------------------");
		/*
		 		���� ���ڸ� ��Ÿ���� �͵�
		 		
		 		1. . 	: ��� ����		�� [] �ۿ� ��� ��� ����
		 		2. \d	: ��� ����
		 		3. \D : ���ڸ� ������ ��� ��
		 		4. \s	: ��� ���� (\t, \n, . .  ���� ��� �����)
		 		5. \S	: ������ ������ ��� �� (������ ���� �ȵ�)
		 		6. \w	: �Ϲ����� ���ڵ��� ��� [a-zA-z0-9_]
		 		7. \W: �Ϲ����� ���ڵ��� ������ ��� ���� ���
		 */		
		System.out.println(Pattern.matches("s.eep", "sheep"));		//��� ����
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));		// . �� ���
		System.out.println(Pattern.matches("s\\.eep", "sheep"));		// . �� ��� 			�̰� ����?
		
		// 2��
		System.out.println(Pattern.matches("s\\deep", "s9eep"));		
		
		// 3��
		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));		
		
		// 4��
		System.out.println(Pattern.matches("s\\seep", "s eep"));		
		System.out.println(Pattern.matches("s\\seep", "saeep"));		// ������ �ƴ�
		System.out.println(Pattern.matches("s\\seep", "s\teep"));		
		System.out.println(Pattern.matches("s\\seep", "s\reep"));		
		System.out.println(Pattern.matches("s\\seep", "s\neep"));		
		
		// 5��
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));		
		
		/*
		 		�ش� ������ ����� ������ ������ �����ϴ� ���
		 		
		 			1. [ex]{n}	: {}���� ������ n�� ��ġ�ؾ� �Ѵ� 
		 			2. [ex]{n, m} : {} ���� ������ �ּ� n�� �̻�, �ִ� m��(m����) ��ġ�ؾ� �Ѵ�
		 				�� ����ǥ���Ŀ� {n, m}ó�� ������ ������ �ȵȴ�
		 			3. [ex]{n,} : {} ���� ������ �ּ� n�� �̻� ��ġ�ؾ��Ѵ�
		 			4. [ex]?	: 0�� �Ǵ� �ѹ�
		 			5. [ex]+	: �ּ� �ѹ� �̻�
		 			6. [ex]* : 0�� �Ǵ� ������
		 */
		// 1��
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "d!35t.txt"));		

		// 2��
		System.out.println(Pattern.matches("[\\D3-5]{3,5}\\.txt", "d!4.txt"));		
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "����.txt"));		
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ���.txt"));		
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "hi.txt"));		
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "��.txt"));		
		
		// 3��
		String regex1 = String.format(".{2,}\\.txt",2);
		System.out.println(Pattern.matches(regex1, "asda.txt"));		
		
		//4��
		System.out.println(Pattern.matches("[��-�R]?\\.txt", ".txt"));		
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "��.txt"));		
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "�ѱ�.txt"));		
		
		// ��ȭ��ȣ ����ǥ����
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-\\d{4}", "010-303-5151"));		
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-\\d{4}", "010-3043-5151"));		
		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-\\d{4}", "010-3043-5151"));		
		
		// ���� ����ǥ����
		System.out.println(Pattern.matches("\\d{6}-?\\d{7}", "011510-3215014"));		
		
		// �������� : �ڹٿ��� ����ϴ� �������� �˻��� �� �ִ� ����ǥ������ ��������
		
		System.out.println(Pattern.matches("[^0-9][\\w��-�R$]*", "_�ڽ�1"));
		
		
		System.out.println(Pattern.matches("^[a-zA-Z_$][\\w��-�R$]*", "_�ڽ�1"));
		System.out.println(Pattern.matches("^[\\D&&\\S&&\\w&��-�R][\\w$��-�R]*$", "_��"));
		System.out.println(Pattern.matches("^[\\D&&\\S&&\\w&��-�R][\\w$��-�R]*a$", "_��a"));
		
		/*
		   		#Pattern.compile(regex)
		   		
		   			- ������ ����ǥ������ �ؼ��Ͽ� Pattern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ�
		   			
		   		# split() : �����ϵ� ���� �ν��Ͻ��� ���ڿ� split()�� �����Ѵ�
		   		
		   		# matcher() : Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
		 */
		String fruits_text = "apple/banana/orange/grape/pineapple/peach/mango/redapple";
		
		Pattern regex = Pattern.compile("/");
		
		String[] fruits = regex.split(fruits_text);
		
		System.out.println(Arrays.toString(fruits));
		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");
		
		Matcher matcher = regex2.matcher(fruits_text);
		
		while(matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "����" +matcher.end() + "����");
		}
	}
}











