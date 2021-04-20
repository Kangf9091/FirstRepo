package myobj.item;

public class Car extends Item {

	int speed;
	
	public Car(String name, int price) {
		super(name,price);
		speed = 100;
	}
	
	public void use() {
		System.out.println(name+"�ӵ���" + speed + "km �Դϴ�");
	}
	
	public static void main(String[] args) {
		new Car("�ڵ���",30000000).info();
	}
}