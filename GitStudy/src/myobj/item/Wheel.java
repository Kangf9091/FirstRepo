package myobj.item;

public class Wheel extends Item {

	int cnt;
	
	public Wheel(String name, int price) {
		super(name,price);
		cnt = 4;
	}
	
	public void use() {
		System.out.printf(name+"°¹¼ö´Â" + cnt + "ÀÔ´Ï´Ù");
	}
	
	public static void main(String[] args) {
		new Wheel("¹ÙÄû",200000).info();
	}
}