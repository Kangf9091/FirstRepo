package quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {
		
		/*
		 		�� ���ڸ� �Է¹ް� �� ������ �ִ� ������� ���غ�����

		�� �ִ� ����� : �� ������ ����� �� ���� ū �����
		
		 */
		
//        System.out.print("���� : ");
//        int num = new Scanner(System.in).nextInt();
//        System.out.print("����2 : ");
//        int num2 = new Scanner(System.in).nextInt();
//        
//        int big = 0, small = 0, gcd = 1;
//
//         if (num >= num2) {
//        	 big = num;
//        	 small = num2;
//        	 }else {
//        		 big = num2;
//        		 small = num;
//        	 }
//         
//         for (int i = small ; i >= 1; ++i) {
//        	 if (num % i == 0 && num2 % i == 0) {
//        		 gcd = i;
//        		 break;
//        	 }
//        	 
//         }
//       System.out.printf("�ִ������� : %d", gcd);
        
        //�� �� �� ���� ������ ��� ����� ���ϸ鼭 , ���� ���ڵ� ���������� Ȯ��
		int num = 30, num2 = 50;
        int gcd = 1;
        int min = Math.min(num, num2);
        int max = Math.max(num, num2);
        
        for(int i = min; i >= 1; --i) {
        	
        	if (min % i == 0 && max % i ==0) {
        		gcd = i;
        		break;
	
        	}
        }
        	System.out.println("gcd : " + gcd);	
        		
    
	}
}

