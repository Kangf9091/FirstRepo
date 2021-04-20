package study;

public class D10_args {
	

	/*
	 	main의 메서드 첫 번째의 매개변수의(args)의 역할
	 		
	 	 - 프로그램 실행시 사용자가 지정한 옵션을 main의 첫 번째 매개변수에 받는다
	 	 - 사용자가 지정한 옵션에 따라 다르게 동작하는 프로그램을 만들 수 있다
	 */
	
	public static void main(String[] args) {
		
		
		System.out.println("args.length : " +args.length);
		
		for(int i = 0; i < args.length; ++i) {
			System.out.println(args[i]);
		}
		
//		boolean apple = false;
//		
//		if(args[0].equals("apple")) {
//			System.out.println("사과 모드로 실행됨");
//			apple = true;
//		}
//		System.out.println("프로그램 종료");
	}
}
