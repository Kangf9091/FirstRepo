package study;


public class C01_Function {

	public static void main(String[] args) {
		
		/*
		 	# �Լ� (Function)
		 		- ����� �̸� �����صΰ� ���߿� ������ ���� ��
		 		
		 		- �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�
		 		
		 		- �����ص� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ�
		 		   ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
		 		   
		 		- ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
		 		  �۾��� �ݺ��� ���� �� �ִ�
		 		
		 		- �Լ��� ���� �� �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
		 		  
		 		- ���� Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� ��Ÿ����
		 */

		for (int i = 0; i < 10; ++i);{
			print_rabbit();
			print_rabbit();
			print_rabbit();
		}
		System.out.println(apple_basket(155,10));
	}
	
	// ex: ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�

	/*
	 public static : ���߿� �����Ұ�
	 int : �� �Լ��� ���� ����� Ÿ�� (���� Ÿ��)
	 apple_basket : Ÿ�� �ڿ� �Լ����� ������ �� �ִ�
	 apple_basket(int apple, int size)
	 		: �� �Լ��� ���� �� �� intŸ�� ���� �� �� ���� �ް�� ���� (�Ű� ����, arguments)
	 		
	*/
	public static String apple_basket(int apple, int size) {
		int reselt = 0;
		
		if(apple % size == 0) {
			reselt = apple / size;
		}else {
			reselt = apple/ size +1;
		}
		// return : �Լ��� ��� �����Ű��, �� �Լ��� ȣ���� ���� ���� �����ش�
		return "�ʿ��� �ٱ����� ������" +reselt +"�� �Դϴ�" ;
	}
	
	
		public static void print_rabbit() {
			System.out.println("  /)/)");
			System.out.println("(   .. )");
			System.out.println("(    >$");
		}
	}

