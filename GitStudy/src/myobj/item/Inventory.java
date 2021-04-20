package myobj.item;
public class Inventory {
	
	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	public boolean put(Item item) {
		for(int i = 0; i < inventory.length; ++i) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		
		System.out.println("������ �� á���ϴ�");
		return false;
	}
	
	public void useAllItems() {
		for(Item item : inventory) {
			if (item != null) {
				item.use();
				
			}
			
		}
	}
	
		
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(5);
		
		// Item�� �־�� �ϴ� �ڸ��� Item�� ��� ���� ��� �͵��� �� �� �ִ�
		
//		for(int i = 0; i < 4; ++i) {
//			if(inven1.put(new Candy("���ݶ�",3000))) {
//				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
//			}else {
//				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
//
//			}
//		}
		inven1.put(new Candy("��ĵ��", 200));	
		inven1.put(new Car("�ƹݶ�", 2403));	
		inven1.put(new Car("��Ʈ��", 503));	
		inven1.put(new Car("����", 4));	
//		inven1.inventory[0].info();
//		inven1.inventory[1].info();
//		inven1.inventory[2].info();
		
		inven1.useAllItems();
		
	}
}
