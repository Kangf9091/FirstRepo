package study;
import myobj.Coffee;
import myobj.DiffPackge;

public class C08_AccessModifier {
	
	/*
	 		#  ���� ������(Access Modifier)
	 		
	 			-	�ٸ� Ŭ��������  �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 				��� ���θ� �����Ѵ�
	 				
	 		# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
	 		
	 			-	���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	 			-	���� ��Ű�� ������ �ٸ� �ڿ�
	 			-	�ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 			-	�ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	 				
	 			- ���� �������� ����
	 			
	 				- private
	 					 �տ� private�� ���� �ڿ��� ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
	 					
	 				- default (�ƹ��͵� �� ��)
	 					���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ִ�
	 					�ٸ� ��Ű�⿡���� ������ �� ����.
	 				
	 				- protected
	 					�տ� protected�� ���� �ڿ���
	 					���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ�,
	 					�ٸ� ��Ű�������� ��ӹ��� Ŭ������ ������ �� �ִ� �ڿ��� �ȴ�
	 					
	 				- public
	 					�ٸ� ��Ű������ �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�
	 					
	 					
	 */
	public static void main(String[] args) {
		C08_SamePakage instance = new C08_SamePakage();

		instance.protcted_method();
		instance.default_method();
		instance.public_method();

		DiffPackge instance2 = new DiffPackge();
		
		instance2.public_method();
		
		Coffee coffee = new Coffee(Coffee.AMRICANO, 1500, 10, 0);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, 4);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOHCA, 2500, 20, 4);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOHCA, 3500, 25, 4);
		
	}
}

class Snack {
	 int size  = 10;
	
	private void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack{
	
	private void abc() {
		System.out.println(size);
	}
}

class Choco extends DiffPackge{
	
	public Choco(){
		// protcerted :  ��� ������ �ٸ� ��Ű�������� ��� ����
		this.protcted_method();   
	}
	
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
}