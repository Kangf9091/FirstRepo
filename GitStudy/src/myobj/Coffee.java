package myobj;

public class Coffee {
	
	private static class CoffeeCode{
		int code;
		String name;
		
		private CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
				
	//private static String[] coffee_names = {"�Ƹ޸�ī��", "ī���", "ī���ī" , "ļ��� �����߶�"};   �ʿ������
	//private static String[] origin_names = {"�ݷҺ��", "�����", "��Ƽ���Ǿ�", "�ɳ�", "�ε�"};  //final�� ����

	public final static CoffeeCode AMRICANO = new CoffeeCode(0, "�Ƹ޸�ī��");
	public final static CoffeeCode CAFE_LATTE = new CoffeeCode(1, "ī���");
	public final static CoffeeCode CAFE_MOHCA = new CoffeeCode(2, "ī���ī");
	
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	int origin;
	
	boolean hot;

	public Coffee(CoffeeCode coffee, int price, int caffeine, int origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin = origin;
		this.hot = true;
	}
	
	public String getCoffeeName() {
		return coffee.name;
	}
	public int getCode() {
		return coffee.code;
	}
	
	public String getOriginName() {
		return null;
	}
	
	
	public static void main(String[] args) {
		
	//	Coffee coffee4 = new Coffee(Coffee.AMRICANO, 1500, 10, Coffee.AMRICANO);
		Coffee coffee = new Coffee(Coffee.AMRICANO, 1500, 10, 0);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, 4);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOHCA, 2500, 20, 4);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOHCA, 3500, 25, 4);
	}
}
