package quiz;

import java.util.Scanner;

public class B03_wonToDoollar {
		// 한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요
		// (현재 환율은 구글 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.75%)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
//			System.out.print("원화 :  ");
//			int won = sc.nextInt();
//			 
//			 float exchange = 0.00089f;
//			 double fees = 0.0175;
//			 System.out.println( (won * exchange)-(won*exchange*fees));
	
		 //final  이 함께 선언된 변수는 나중에 값을 변경 할 수 없다
		final double WON_TO_DOLLAR = 0.00089;  //변수를 바꿀수 없음
		
		System.out.print("한국 돈을 입력하세요. 달러로 바꿔드립니다. (수수료 : 1.75%) >  ");		
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchange_fee = usd * 0.0175;
		
		System.out.printf("%d원은 %.2fusd입니다.\n", korMoney,  (usd * 0.9825)); 
		System.out.printf("%d원은 %.3fusd입니다.\n", korMoney,  usd - exchange_fee); 
		
		System.out.println(Math.round(usd *0.9825 * 100) / 100.0 + "$");
		System.out.println(Math.round(usd *0.9825 * 1000) / 1000.0 + "$");
		
		

			 
			 }

}
