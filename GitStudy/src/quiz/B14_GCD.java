package quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {
		
		/*
		 		두 숫자를 입력받고 두 숫자의 최대 공약수를 구해보세요

		※ 최대 공약소 : 두 숫자의 공약수 중 가장 큰 공약수
		
		 */
		
//        System.out.print("숫자 : ");
//        int num = new Scanner(System.in).nextInt();
//        System.out.print("숫자2 : ");
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
//       System.out.printf("최대공약수는 : %d", gcd);
        
        //둘 중 더 작은 숫자의 모든 약수를 구하면서 , 남은 숫자도 나눠지는지 확인
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

