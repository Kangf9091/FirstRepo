package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {

		/*
		 		����ڷκ��� ������ �ϳ� �Է¹ް�
		 		�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		 */

////        System.out.print("�Է� : ");
////        int num = new Scanner(System.in).nextInt();
//		int num = 100;
//        int count = 0;
//        for (int i = 1 ; i <= num; ++i) {
//        int  a = i % 10 , b = i / 10;
//        if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b ==9)) {
//        		System.out.print("X");
//        //	count += i;
//        } else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b ==9)) {
//        	System.out.print("x");
//        	//count += i;
//        } else {
//        	System.out.print(i);
//        }
//     //   System.out.print(num);
//        	
//        }        
//	}
//}
//     
        
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1. ���ڿ��� Ǯ��
		
//		System.out.println("hello : " + 123);
//		System.out.println("" + 123);
//		System.out.println(Integer.toString(123));
	
		System.out.print("����  :");
		int input = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;
			System.out.print(i + " : ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if (num_ch == '3' || num_ch == '6' || num_ch == 9) {
					cnt ++;
					System.out.print("¦");
				}
			}
			System.out.println();
		}
        	System.out.println("�� �ڼ� Ƚ���� : " + cnt + "ȸ");
        	
        	// 2. ������ Ǯ��
        	
        	}

	}


		


