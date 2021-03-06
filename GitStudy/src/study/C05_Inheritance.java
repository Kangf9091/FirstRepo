package study;

public class C05_Inheritance {

		/*
		 	# 클래스 상속
		 	
		 		- 이미 존재하는 클래스를 그대로 물려받거나 고쳐서 사용하는 것
		 		- 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 한다
		 		- 상속받는 클래스를 자식 클래스 또는 서브 클래스하고 한다
		 	
		 */
	public static void main(String[] args) {
		Person[] person = new Person[3];
		
		person[0] = new Person("홍길동", 10, 10);
		person[1] = new Person("고길동", 45, 15);
		person[2] = new Person("이길동", 30, 12);
		
		person[0].sayHi();
		person[1].sayHi();
		person[2].sayHi();
		
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("둘리");
		
		
	}


}
class Person{
	
	String name;
	int age;
	int speed;
	
		public Person(String name, int age, int speed) {
			this.name = name;
			this.age = age;
			this.speed = speed;
		}
		void sayHi() {
			// 연습문제: 나이를 먹을수록 공손하게 인사하도록 만들어보세요
			if(age <0) {
			System.out.printf("?");
			}else if(age > 10){
			System.out.printf("안녕 나는 %s이야. 나이는 %d살이야.\n",name, age);
			}else if(age < 20) {
			System.out.printf("안녕하세요 저는 %s입니다. 나이는 %d살입니다.\n",name, age);
			}else {
			System.out.printf("안녕하십니까 저는 %s입니다. 나이는 %d살입니다.\n",name, age);
			}
		}
		void walk() {
			System.out.printf("%s씨는 한번 걸으면 %d만큼 움직입니다\n", name, speed / 2);
		}
		void run() {
		System.out.printf("%s씨는 %d미터 뛰었습니다.\n", name , speed);
		}
}
/*
 	1. 상속받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다.
 		부모 클래스에 기본생성자가 존재하면 생략할 수 있지만,
 		존재하지 않을때는 생략이 불가능하다
 	
 	2. 자식 클래스는 부모의 메서드를 마음대로 고쳐서 사용할 수 있다 (오버라이드, Override)
 	
 	3. 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우
 		super와 this로 정확하게 구분할 수 있다
 */

class Police extends Person{
	
	// 자식 클래스의 생성자에서는 첫 줄에 super()를 반드시 호출해야 한다. (필수)
	String name = "마동석";
		
		
	public Police(){
		super("김경찰" , 23, 20);
		//super(); >> 기본 생성자가 있다?? 다시 확인해볼것 
		
		// super(): 부모 클래스의 생성자를 호출할 떄 사용한다.
	}
	void sayHi() {
		System.out.printf("안녕하십니까! 저는 %s 형사입니다.\n", name);
	}

	void thisSuperTest(String name) {
		System.out.println("그냥 name :" + name);
		System.out.println("this.name :" + this.name);
		System.out.println("super.name:" +super.name);
	
	}
	
	void arrest(String suspect) {
		System.out.printf("%s 형사는 범죄자 %s씨를 체포했습니다.\n" , name, suspect);
	}
}

//class Programmer extends Person{
	
	// 모든 생성자를 생략할 시
	// 자식 클래스에도 기본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한
//}