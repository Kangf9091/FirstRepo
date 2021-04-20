package myobj.item;

public class Notebook extends Item {

	String color;
	
	public Notebook(String name, int price) {
		super(name,price);
		color = "black";
	}

	public void use() {
		System.out. printf(name+"ªˆ±Ú¿∫" + color + "¿‘¥œ¥Ÿ");
	}
	
	public static void main(String[] args) {
		new Notebook("≥Î∆Æ∫œ",20000).info();
	}
}