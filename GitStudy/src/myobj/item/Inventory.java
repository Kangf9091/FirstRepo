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
		
		System.out.println("가방이 꽉 찼습니다");
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
		
		// Item을 넣어야 하는 자리에 Item을 상속 받은 모든 것들이 들어갈 수 있다
		
//		for(int i = 0; i < 4; ++i) {
//			if(inven1.put(new Candy("리콜라",3000))) {
//				System.out.println("아이템이 잘 들어가면 put()에서 true가 리턴됨");
//			}else {
//				System.out.println("아이템이 잘 들어가면 put()에서 true가 리턴됨");
//
//			}
//		}
		inven1.put(new Candy("목캔디", 200));	
		inven1.put(new Car("아반떼", 2403));	
		inven1.put(new Car("노트북", 503));	
		inven1.put(new Car("바퀴", 4));	
//		inven1.inventory[0].info();
//		inven1.inventory[1].info();
//		inven1.inventory[2].info();
		
		inven1.useAllItems();
		
	}
}
