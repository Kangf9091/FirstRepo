package study;

public class B12_SwapValue {

	public static void main(String[] args) {
		
		int a = 10,  b = 20;
		int  tem;
		
		System.out.printf("a : %d, b : %d\n" ,a ,b);
		//tem�� ��� ���� 
		tem = a;
		// a�� b�� ���� (a�� �������)
		a = b;
		// �Ʊ� �����س��� tem�� b�� ����
		b = tem;
		
		System.out.printf("a : %d, b : %d\n" ,a ,b);
		
	}

}
