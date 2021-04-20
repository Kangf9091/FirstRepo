package study;

public class A01_Escape {

	public static void main(String[] args) {
		
		/*
		 	# Escape ����
		 	
		 		- Ư���� ����� ���� ���ڵ�
		 		- �׳� ����Ϸ��� �ϸ� ������ �߻��ϴ� Ư���� ���ڵ�
		 		- �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ�
		 		- �տ� ���� \�� �ڿ� ���ڰ� �������� �ϳ��� ���ڷ� �νĵȴ�
		*/
		
		System.out.println("�ȳ��ϼ���, �ݰ����ϴ�.");
		
		// \n : �� �ٲ��� ����� ���� Ư�� ���� (linefeed, breakline, newline, ...)
		System.out.println("�ȳ��ϼ���, ��\n��\n���ϴ�.");
		
		// \t : TabŰ�� ����� ���� Ư�� ����
		System.out.println("�ȳ��ϼ���, ��\t��\t���ϴ�.");
		
		// \ : Escape������ ����� �̿����� �ʰ� �׳� ����ϰ� ������
		System.out.println("�ȳ��ϼ���, ��\\t��\\t����\\��.");
		
		// ex> JDK�� ��θ� ����ϰ� ������
		System.out.println("c:\\Program Files\\JAVA\\JDK");
		
		// \" : �׳� ū ����ǥ�� ����ϰ� ���� �� ����Ѵ�
		System.out.println("������ �������� \"�Ŷ��\"�� �Ծ�߰ڴ�.");
		
		// \' : �׳� ���� ����ǥ�� ����ϰ� ���� �� ����Ѵ�
		System.out.println("������ �������� '�Ŷ��'�� �Ծ�߰ڴ�.");
		System.out.println('\''); 
				

		
	}
}
