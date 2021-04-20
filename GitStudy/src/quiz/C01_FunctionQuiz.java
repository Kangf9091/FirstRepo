package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_FunctionQuiz {

		/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 		1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 		2. ������ ���ڰ� 3�ǹ���̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 		3. ���ڸ� �ϳ� �����ϸ� ���ڿ� '¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 		4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 		5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 		6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 			factorial : (n)*(n-1)*(n-2)*..... 3*2*1
	 */
	//  1��
	public static boolean IsAlpha(char ch) {
		return ch >='A' && ch <= 'Z' || (ch >= 'a' && ch <= 'z');
	}
	// 2��
	public static boolean Is3sBaesu(int num) {
		return num % 3 == 0;
	}
	// 3��
	public static String evenOdd(int num) {
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	//4 ��
	// ��� ����� ã�Ƽ� �迭�� ���� ��ȯ�ϸ� ����
	public static int[] findDivide(int num) {
		boolean[] divide = new boolean[num];
		int count = 0;
		
		for (int i = 1; i < num; ++i) {
			if (num % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		
		for(int i = 0; i< divide.length; ++i) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
  	
	// 5��
	public static boolean isPrime(int num) {
		double sqrt = Math.sqrt(num);
		
		for(int i = 2; i <= sqrt; ++i) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//6��
	public static int factorial(int num) {
		//--        --                                             if ( num==2) return 2;
		int result = 1;
		
		for(int i = num; i > 0; --i) {
		
			result *= i;
		}
		
		return result;
		// return num * factorial(num - 1);      
	}
	
	public static int add(int a, int b) {// ����
		int result = a + b;
		return result;
	}
	public static int gop(int a, int b) {// ����
		int result = a * b;
		return result;
	}
	
	public static void main(String[] args) {
		int a = 5;																			//
		int b = 4;																			//
		int sum = add(a,b);															//
		int gop = gop(a,b);															//
		System.out.printf("%d + %d = %d\n", a, b, sum);			//���� ��
		System.out.printf("%d * %d = %d\n", a, b, gop);			//���� ��
		
				
		System.out.println(Arrays.toString(findDivide(100)));
		System.out.println(factorial(11));
		System.out.println(IsAlpha('a'));
		System.out.println(Is3sBaesu(3));
		System.out.println(Arrays.toString(findDivide(10)));
	}
}
