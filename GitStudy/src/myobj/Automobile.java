package myobj;

public class Automobile {

	public static void main(String[] args) {
		car c01 = new car();
		car c02 = new car();
		car c03 = new car();
		car c04 = new car();
		
		c02.newAvantePrice = 2600;
		
		System.out.println(c01.newAvantePrice);
		System.out.println(c02.color);
		System.out.println(c03.emergencyLight);
		System.out.println(c04.wheel);
		
	}
}
class car{
	static int newAvantePrice = 2400 ;
	static int emergencyLight = 1;
	
	String color;
	int wheel;
	int carNum;
	int door;
	
	
	
	static void changeNewAvantePrice(int newAvantePrice){
		car.newAvantePrice = newAvantePrice;
}
}


