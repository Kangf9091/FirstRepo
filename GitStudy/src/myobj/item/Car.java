package myobj.item;

public class Car extends Item {

	int speed;
	
	public Car(String name, int price) {
		super(name,price);
		speed = 100;
	}
	
	public void use() {
		System.out.println(name+"속도는" + speed + "km 입니다");
	}
	
	public static void main(String[] args) {
		new Car("자동차",30000000).info();
	}
}