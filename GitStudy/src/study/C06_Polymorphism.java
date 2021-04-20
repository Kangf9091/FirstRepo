package study;
import java.util.Scanner;
// Apple a1 = new Apple();        >Apple Ÿ��  new Apple(); ������ a1 ?
public class C06_Polymorphism {


		/*
		 	# ��ü�� ������
		 		
		 		- ��ü�� �پ��� ���¸� ���� �� �ִ�
		 		- ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
		 		- ������ ���������� ����� �ƴϴ�
		 		
		 	# �ڽ� Ŭ���� �θ� Ŭ������ �� �� �ִ� ( ��ĳ����)
		 	
		 		- �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�
		 		- ��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ������
		 		- �������̵�� �޼���� �ڽ� Ŭ�������� ������ ������ ����ȴ�
		 				 		
		 	# �θ� Ŭ������ �ڽ� Ŭ������ �� �� ���� (�ٿ� ĳ����)
		 	
		 		- ������ ���������� ��ĳ���� �Ǿ��� �ν��Ͻ��� �ٽ� ������ Ÿ��������
		 		   �ٿ� ĳ������ �����ϴ� 
		 				 		
		 */
	public static void main(String[] args) {
		new Food(new PigMeat(), new Vege(), new Balsamic());

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str1 = new String();

		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
//		Meat  meat = new Meat();                 >>>>>>>>>>>>>> �ݴ�δ� �Ұ�����
//		Meat meat2 = new MainMaterial();
		
		doSomethingWithMainMaterial(new MainMaterial());
		doSomethingWithMainMaterial(new Meat());
		doSomethingWithMainMaterial(new Fish());
		doSomethingWithMainMaterial(new PigMeat());
		
		System.out.println(new Fish().a);
		
		new Car(new Tire());
	//	new Car(new Tire2());                 >>>>>>>>> �Ұ��� �ƿ� �ٸ� Ŭ����
		
		// ��� �޾Ƽ� ����
		new Car(new TireVer1());
		new Car(new TireVer2());
		
		Police polise = new Police();
		
		polise.sayHi();
		polise.arrest("�谭��");
		
		// Person���� ��ĳ���� �� Police�� ü���� �� �� ����
		Person person = polise;     //>>>>>>>>>>>>>>>>>>>>>>>����ĳ��? �ٿ�ĳ����?
		Person person2 = new Person("����ġ", 20, 30);
		//person.arrest();
		
		person.sayHi();
		
		// �ٿ� ĳ������ Ȱ���� ���� ��� �ٽ� ����ϱ�
		
		// ���� �����̾��� �ν��Ͻ��� �ٿ�ĳ������ ����
		((Police) person).arrest("��Ҹ�");
		
		//���� ������ �ƴϾ��� �ν��Ͻ��� �ٿ�ĳ������ �Ұ���
		//((Police) person2).arrest("�赵��");
		
	}

	public static void doSomethingWithMainMaterial(MainMaterial mat) {
		
	}
	
}
class Car{
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
}
class Tire{}
class Tire2{}

class TireVer1 extends Tire {}
class TireVer2 extends Tire {}

class Food{

	MainMaterial mainMat;
	SubMaterial subMat;
	Sause sause;
	
	public Food(MainMaterial mainMat, SubMaterial subMat, Sause sause) {
		this.mainMat = mainMat;
		this.subMat = subMat;
		this.sause = sause;
		
	}
	
class PorkCutlet extends Food{
	
	public PorkCutlet(PigMeat pig, SubMaterial subMat, Sause sause) {
		super(pig, subMat, sause);
	}
}
	
}

// ���� ���� �θ� Ŭ���� (�����, �����, �ҽ�)
class MainMaterial{
	public static int a = 10;
}
class SubMaterial{}
class Sause{}

// ����Ḧ ��ӹ��� Ŭ������
class Fish extends MainMaterial{}
class Meat extends MainMaterial{}

// �� ��Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class PigMeat extends Meat{}

// ����Ḧ ��ӹ��� Ŭ������
class Vege extends SubMaterial{}
class Fruit extends SubMaterial{}

// �ҽ��� ��ӹ��� Ŭ������
class Salsa extends Sause{}
class Balsamic extends Sause{}












