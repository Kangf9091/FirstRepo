package myobj.item;

public class Notebook extends Item {

	String color;
	
	public Notebook(String name, int price) {
		super(name,price);
		color = "black";
	}

	public void use() {
		System.out. printf(name+"������" + color + "�Դϴ�");
	}
	
	public static void main(String[] args) {
		new Notebook("��Ʈ��",20000).info();
	}
}