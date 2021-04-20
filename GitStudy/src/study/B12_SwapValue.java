package study;

public class B12_SwapValue {

	public static void main(String[] args) {
		
		int a = 10,  b = 20;
		int  tem;
		
		System.out.printf("a : %d, b : %d\n" ,a ,b);
		//tem에 잠시 보관 
		tem = a;
		// a에 b를 넣음 (a가 덮어씌워짐)
		a = b;
		// 아까 보관해놨던 tem를 b에 넣음
		b = tem;
		
		System.out.printf("a : %d, b : %d\n" ,a ,b);
		
	}

}
