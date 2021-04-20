package study;

/*
	#	�ּ� (comment)
	
		- ���α׷��Ӱ� �ϰ� ���� ���� ���� ��
		- �ּ��� ���α׷� ���࿡ ������ ��ġ�� �ʴ´�
		- �ַ� �� �ҽ��� ���� �� �ٸ� ���α׷��ӵ鿡�� �����ϴ� �뵵�� ����Ѵ�
		- �츮�� ���ο����� ����Ѵ�

	# Eclipse ����Ű ����     
	
	- ctrl + [+,-] : ���� ũ�� ����     ctrl + Shift + [+,-]
	- ctrl + F11 : �ҽ� �ڵ� ������ �� ���� (Run)
	- Alt + ����Ű : �� �ű��
	- Tab : �鿩����
	- Shift + Tab : �Ųٷ� �鿩����
	- Shift + End : Ŀ���� ���� ��ġ���� �� �� ������ �������
	- Shift + Home : Ŀ���� ���� ��ġ���� �� �� �ձ��� �������
	- ctrl + C : �����ϱ�
	- ctrl + X : �߶󳻱�                         �̸� �ٲٱ� F2
	- ctrl + V : �ٿ��ֱ�
	- ctrl + Z : �ǵ�����
	- ctrl + Y : �ǵ����� ���
*/	

/** ����ȭ �ּ� (��ǳ���� �����ϰ� �Ǵ� �ּ�) */
	
/* ���� ���� ����� �� �ִ� �ּ� */	

// �� �ٸ� ����� �� �ִ� �ּ�

// * public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
// ���� ���� ������ ���� �װ��� Ŀ���� �ΰ� F2�� ������
// ������ ���� ������ �ذ�å�� �� �� �ִ�
	
	/*
	 # main() �Լ�
	 
	 - ���α׷��� ���� ����
	 - ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
	 - main() �Լ��� ������ �߰�ȣ{}�� �����ȴ�
	 
	 # �Լ���?
	 	- �ܾ� �ڿ� ()�� �ִ� ���� ��� �Լ���� �θ���
	 	
	*/
	public static void main(String[] args) {
		//���α׷� ����
		
		/*
		// # System.out.println() �Լ�
		 
		 		- ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		 	
		 	# �ܼ�
		 		- ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		 		- Eclipse�ȿ����� �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ�
		 		- ctrl + F11�� ������ �츮�� ���� ���α׷���
		 		  �׽�Ʈ�� �ܼ� �󿡼� �����غ� �� �ִ�
		 		- �츮�� ���� �ҽ� �ڵ��� ������� bin������ ����Ǿ� �ִ�
		*/
		System.out.println("hello, world!"); // ctrl + F11
		
		System.out.println("��������������������������������");
		System.out.println("�� 1. Start game    ��  ");
		System.out.println("�� 2. Load game   �� ");
		System.out.println("�� 3. Exit                  ��");
		System.out.println("��������������������������������");
		
		/*
		 	# �ڹ��� �����͵� (���ͷ�)
		 	
		 	1. "" ���̿� ���� �͵�	: ���ڿ�(string), ���ڸ� ������ �� �� �ִ� ������ Ÿ��
		 	2. '' ���̿� ���� ��	: ����(Character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		 	3. �׳� ���ڸ� ���� ��	: ����(Interger)
		 	4. �Ҽ��� ���� ��		: �Ǽ�(Float, Duble)
		 	5. true, false
		*/
		System.out.println("ABCDEFG �������");
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println(1000 + 500);
		System.out.println(123.45678 + 10.5);
		System.out.println(true);
		System.out.println(false);

		// # ���ڵ��� �����δ� ���ڰ��� ������ �ִ�
		//   �츮 ���� ���϶��� ���ڷ� ���̴� ���̴�
		
		// ��, '' Ÿ���� ����Ÿ���� ��ȯ �� �� �ְ� ���� Ÿ�Ե� ''Ÿ������ ��ȯ �� �� �ִ�
		// ���ڿ� ������ �����δ� ���� Ÿ���̸� ���� ��굵 �����ϴ�
		System.out.println('A');
		System.out.println((int)'A');	
		System.out.println((int)'��');	
		System.out.println((int)'��');		// (int)�� ���� - ���ڸ� ���ڷ� ���̰� ��
 		System.out.println((char)54621);	// (char)�� ���� -���ڸ� ���ڷ� ���̰� ��
		System.out.println((char)54622);	
		System.out.println((int)'��');
		
		System.out.println((char)('A' + 0));	
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		
		// # ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ� ���� �ƴ϶� �̾���δ�
		System.out.println("'A'�� �������� ��� : " + 'A');
		System.out.println("'A'�� �ڵ尪 : " + (int)'A');
		System.out.println("'A'�� �ڵ尪 : " + (int)'1');
		System.out.println("1" + 5); // ���ڿ� + ����
		System.out.println('1' + 5); // ����(�ڵ尪) + ����
		System.out.println(1 + 5);	 // ���� + ����
		
		// # ���� + �Ǽ��� �Ǽ��� �ȴ�
		System.out.println(10 + 10.123);
		
		// # ���� + ���ڴ� ������ �ȴ�
		System.out.println('a' + 10);
		System.out.println((char)('a' + 10));
		
		// ; (�����ݷ�)
		// - �� ��ɾ �������� �˸���
		
		
		// ���α׷� ��
	}

}










