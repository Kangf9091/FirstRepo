package study;

public class B06_IF {
	
	public static void main(String[] args) {
		
		/*
		 	# if ��
		 	
		 		- ()���� ���� true �� �� {} ���� ������ �����Ѵ�
		 		- ()���� ���� false �϶��� {}���� ������ �����Ѵ�
		 		- {}�ȿ� �� ������ �� �����̶�� {}�� ���� �� �� �ִ�
		 		
		 	# else if��
		 		- ���� �ִ� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
		 		- else if�� �ܵ����� ��� �� �� ����
		 		- else if�� ���� �� ����� �� �ִ�
		 		
		 	# else��
		 	 - ���� �ִ� if, else if�� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
		 	 - if �ٷ� ������ �� ���� �ִ�
		 	 - else 
		 		
		*/
		int a = 6;
		
		
		if (a == 5) {
			System.out.println("Hello!");
			System.out.println("Hello2");
			
		} else if (a == 6) {
			System.out.println("Nice to meet you!");
		} else if (a > -10) {
			System.out.println("Greeting!");
		} else if (a > -20) {
			System.out.println("Good to see you!");
		}
		
	//--------------------------------------------------------------------
		
		char  ch = 0x3050;
		
		if (ch >= '��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ�");
		}else if (ch >= 0x3040 && ch <= 0x30FF ){
			System.out.println("ch�� ����ִ� ���� �Ϻ��� �Դϴ�");
		}else  {
			System.out.println("ch�� ����ִ� ���� �ѱ��� �ƴմϴ�");
		}
		
		
		System.out.println("���α׷��� �������ϴ�.");
			
	}
}

