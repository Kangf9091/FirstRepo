package study;
import myobj.Peach;
import myobj.Phone;

public class C02_OOP {
	
	/*
	 	# ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	 		
	 		- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 		- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
				���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
	 		- ��ü (Object) : ���� �����ϴ� ��� ���� ���Ѵ� (�繰, ���� ,. .... ���)
	 		
	 		ex: ���
	 			- ����� ����: ũ��, ����, �絵, �������, ������ Į�θ� ...
	 			- ����� �޼���
	 			 			-> ������ (ũ�� ��ŭ�� �������� ������)
	 			 			-> �Դ´� (���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���)
	 			 			-> �����Ѵ� (����� �����ϸ� ��������� ������ �����Ѵ�)
	 			
	 			 
	 	# Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ��� (��� JAVA���� �޼���ۿ� ����)
	 	
	 	# Ŭ���� (Class)
	 	
	 		- ��ü�� ���α׷��� ���� ǥ���� ��
	 		- Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
	 		- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�' ��� �θ���
	 		- Ŭ������ ������ ���� Ÿ���̴�
	 		
	 */
	
	// ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�
	public static void main(String[] args) {
		
		// Apple Ŭ���� (���赵)�� ���� �ν��Ͻ�(����ǰ) a1
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		//myobj �� �ҷ����� ���� �ϳ� ���� ��
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();                        // ����Ʈ ��Ʈ�� O
		
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		a1.size = 10;
		
		a1.eat();
		a2.eat();
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		System.out.println(a1.size);
		
		String str1 = "abc";
		String str2 = "ccc";
		String str3 = "bb";
		
		/*
		  	myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
		  	�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
		  	
		  	# �ν��Ͻ� ���� 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
		 */
		
//	myobj.Phone i1 = new myobj.Phone();
//	myobj.Phone i2 = new myobj.Phone();
	
		Phone i1 = new Phone();
		Phone i2 = new Phone();
	

	i1.weight = 3.3;
	i1.model = "Samsung";
	i2.color = "white";

	i1.lostCase();
	i2.lostCase();
	
	System.out.println(i1.weight);
	System.out.println(i2.color);
	System.out.println(i2.model);
		
	}
}

// default class (public�� �� ���� class)
class Apple{
	
	/*
		# �ν��Ͻ� ����
			- �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
			- aka �ʵ�, �Ӽ�, ��� ����, ���� ....
	 */
	
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	// function �ٸ� ���
	
	/*
	  	# �ν��Ͻ� �޼���
	  		- �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}
	
