package myobj.item;

/*
 *	�� Ŭ������ ��ӹ޾� �������� 3�� ��������(# ItemŬ������ �������� ����)
 */
abstract public class Item {

	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price + "��");
	}

	abstract public void use();
}


