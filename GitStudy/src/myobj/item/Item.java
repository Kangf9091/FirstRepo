package myobj.item;

/*
 *	이 클래스를 상속받아 아이템을 3개 만들어보세요(# Item클래스는 수정하지 말것)
 */
abstract public class Item {

	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price + "원");
	}

	abstract public void use();
}


