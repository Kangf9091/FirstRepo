package study;

public class A03_VarTypes {

	public static void main(String[] args) {
		/*
		 
		 	# ���� Ÿ��
		 		- byte (1byte) 
		 		
		 			1byte => 8bit
		 			
		 			0000 0000 (0) ~ 1111 1111 (255)
		 			
		 			* ù ��° bit�� ��ȣ ��Ʈ�� ���ȴ�
		 			
		 			byteŸ���� ����� ���� 0000 0000 (0) ~ 0111 1111 (127)
		 			byteŸ���� ����� ���� 1000 0000 (-128) ~ 1111 1111 (-1) ���� 1�� ����
		 			
		 			2 ^ 1 - 2����
		 			2 ^ 2 - 4����
		 			2 ^ 3 - 8����
		 			2 ^ 4 -16����
		 			2 ^ 5 -32����
		 			....
		 			2 ^ 8 -256����
 			
		 		- short(2byte, signed)
		 		
		 			2byte -> 16bit
		 			
		 				2 ^ 16 - 65536����
		 				
		 				short�� ��� ���� 0 ~ 32767
		 				short�� ���� ���� -32768 ~ -1
		 			
		 		- char (2byte, unsigned)
		 		
		 			2byte -> 16bit
		 			
		 				2 ^ 16 - 65536����
		 				0 ~ 65535
		 				
		 				��ȣ�� ���� ������ 0 ~ 65535�� ����� ������ �� �ִ� Ÿ��
		 				�ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (���� Ÿ��)
		 						 						 			
		 		- int  (4byte)
		 		
		 			4byte -> 32bit
		 			2 ^ 32 - 4,294,967,296
		 			
		 			int�� ��� ���� 0 ~ 2,147,483,647
		 			int�� ���� ���� -2,147,483,648 ~ -1
		 			 			
		 		- long (8byte)
		 		
		 			8byte -> 64bit
		 			2 ^ 64 - �ſ�ſ�ŭ
			
			*/
			byte minByte = -128;
			byte maxByte = 127;
			
			System.out.println("byte Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + maxByte + "�̰�,"
					+ "���� ���� ����" + minByte + "�Դϴ�");
			
			
			short minShort = -32768;
			short maxShort = 32767;
			
			System.out.println("short Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + maxShort + "�̰�,"
					+ "���� ���� ����" + minShort + "�Դϴ�");
			
			
			char minChar = 0;
			char maxChar = 65535;
			
			char ch = 65;
			
			System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�. " + ch);
			System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�"
					+ (int)ch);
					
			System.out.println("char Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + (int)maxChar + "�̰�,"
					+ "���� ���� ����" + (int)minChar + "�Դϴ�");
			
			int maxInt = 2_147_483_647;
			int minInt = -2_147_483_647;
			
			System.out.println("short Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + maxInt+ "�̰�,"
					+ "���� ���� ����" + minInt + "�Դϴ�");
			
			
			//����
			
			// int�� ������ �Ѿ�� ���ڸ� ����� ���� L�� �ٿ��� �Ѵ�
			long _Long = 2_147_483_648L;
			
		
		
			/*
		

		 	# �Ǽ� Ÿ��
		 	
		 		- float  (4byte)
		 		- duuble (8byte)
		 		
		 		�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
		 		�ε��Ҽ��� ����� ����Ѵ�
		 		
		 	/*
		 	 
		 	 */
			// �׳� �Ҽ��� ���� ���� �⺻������ double Ÿ���̴�
			// float Ÿ���� �Ҽ��� �ڿ� F�� �ٿ��� �Ѵ�. *****
		 	float weight = 65.66F;
		 	double height = 177.77;
		 	
		 	System.out.println("�����Դ� " + weight);
		 	System.out.println("Ű�� " + height);
		 	 
		 	/*
		 	# boolean Ÿ��
		
		 		���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
		 		���� ture�� false�ۿ� ����
		 	*/
		 	boolean hasFood = true;
		 	boolean over130cm = false;
		 	
		 	System.out.println("������ ������ �ִ°�? " + hasFood);
		 	System.out.println("Ű�� 130cm�� �Ѵ°�? " + over130cm);
		 	
		 	/*
		 		
		 	# ������ Ÿ�� (Ŭ���� Ÿ��)
		 		
		 		������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�
		 		
		 		- String : ���ڿ�
		 		- �� �� ��� Ŭ������ ...
		 		
		 		
		 	
		 	*/
		 	String helloMessage = "Hello, My name is John Doe.";
		 	String byeMessage = "Good bye.";
		 	
		 	System.out.println(helloMessage);
			System.out.println("helloMessage");
		 	
			System.out.println(helloMessage + byeMessage + byeMessage);
		 	


	}

}
