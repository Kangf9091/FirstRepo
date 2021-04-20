package myobj.item;

public class Wheel extends Item {

	int cnt;
	
	public Wheel(String name, int price) {
		super(name,price);
		cnt = 4;
	}
	
	public void use() {
		System.out.printf(name+"������" + cnt + "�Դϴ�");
	}
	
	public static void main(String[] args) {
		new Wheel("����",200000).info();
	}
}