package study;

public class B17_Array {

	public static void main(String[] args) {
		/*
		 	# �迭 (Array)
		 	
		 		- ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
		 		- ���� �̸����� ������ ������ ������ �� �ε����� Ȱ���� �����Ѵ�
		 		- �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
		 		- �迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�
		 			(����: 0, �Ǽ�: 0.0, boolean: false, ������: null)            while(1) true
		 */
		
		int[] score = new int[133];
		
		//int score1, score2, score3....................
		//�迭�� �迭.length�� ���� ���̸� �� �� �ִ� (�迭�� ��ȣ�� �ȵ�)
		for (int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 101);
		}
		System.out.println("10��° �л��� ���� :" + score[9]);
		
		// ��������1 : score�� ���հ� ���(�Ҽ� ��° �ڸ�)�� ����غ�����
		
		int sum=0;
		
		for(int i=0; i<score.length; i++) { 
			sum += score[i];
		}
		double average = sum / score.length;
		System.out.printf("���� : %d\n",sum);
		System.out.printf("��� : %.2f", average);
		System.out.printf("%d, %.2f\n",sum , sum / (double)score.length);
		
		/*
		 	# �迭�� �����ϴ� ���
		 	
		 		1. Ÿ��[] �迭�̸� = new Ÿ�� [�迭ũ��];
		 		2. Ÿ��[] �迭�̸� = {��1, ��2, ��3, ...];
		 		3. Ÿ��[] �迭�̸� = new Ÿ��[] { ��1, ��2, ��3};
		 		
		 */
		char[] grades = new char[50];
		
		int[] age = {10 ,20 ,30 };
		boolean[] passExam = { true, false, true};
		
		String[] animals = new String[] { "Lion" , "tiger" , "penguin" , "monkey"};
		
		
		System.out.println(animals[1]);
		
		if(passExam[0]) {
			System.out.println("�ι�° ���� ���");
		}
	
		for(int i = 0; i < grades.length; ++i) {
			System.out.println((int)grades[i]);
		}
		
		// # �迭�� ������ �ٸ��� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ�
		int [] arr = new int[3];
		int a,b,c;
		
		System.out.println("arr[0] : " + arr[0]);
		
		//# String�� char�� �迭�� ��ȯ�� �� �ִ�
		char[] msg1 = new char[] {'h', 'e', 'l', 'l', 'o'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();  //  �˻�
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
		
		}
		
	}


