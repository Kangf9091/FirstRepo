package quiz;

import java.util.Scanner;

public class B03_wonToDoollar {
		// �ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������
		// (���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
//			System.out.print("��ȭ :  ");
//			int won = sc.nextInt();
//			 
//			 float exchange = 0.00089f;
//			 double fees = 0.0175;
//			 System.out.println( (won * exchange)-(won*exchange*fees));
	
		 //final  �� �Բ� ����� ������ ���߿� ���� ���� �� �� ����
		final double WON_TO_DOLLAR = 0.00089;  //������ �ٲܼ� ����
		
		System.out.print("�ѱ� ���� �Է��ϼ���. �޷��� �ٲ�帳�ϴ�. (������ : 1.75%) >  ");		
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchange_fee = usd * 0.0175;
		
		System.out.printf("%d���� %.2fusd�Դϴ�.\n", korMoney,  (usd * 0.9825)); 
		System.out.printf("%d���� %.3fusd�Դϴ�.\n", korMoney,  usd - exchange_fee); 
		
		System.out.println(Math.round(usd *0.9825 * 100) / 100.0 + "$");
		System.out.println(Math.round(usd *0.9825 * 1000) / 1000.0 + "$");
		
		

			 
			 }

}
