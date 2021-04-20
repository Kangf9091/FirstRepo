package myobj;

import myobj.item.Candy;

public class Peach {

	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	public Peach() {}

	// 다른 패키지를 가져다 쓰고 싶을때는 public을 붙여야 한다
	void eat() {
			size--;
			calorie -= 10;
		}
		public static void main(String[] args) {
			Candy candy = new Candy("홀스",1000);
}
}


