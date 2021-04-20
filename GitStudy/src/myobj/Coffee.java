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
				
	//private static String[] coffee_names = {"아메리카노", "카페라떼", "카페모카" , "캬라멜 마끼야또"};   필요없어짐
	//private static String[] origin_names = {"콜롬비아", "브라질", "에티오피아", "케냐", "인도"};  //final로 가능

	public final static CoffeeCode AMRICANO = new CoffeeCode(0, "아메리카노");
	public final static CoffeeCode CAFE_LATTE = new CoffeeCode(1, "카페라떼");
	public final static CoffeeCode CAFE_MOHCA = new CoffeeCode(2, "카페모카");
	
	
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
