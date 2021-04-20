package study;
import myobj.Coffee;
import myobj.DiffPackge;

public class C08_AccessModifier {
	
	/*
	 		#  접근 제어자(Access Modifier)
	 		
	 			-	다른 클래스에서  해당 클래스의 자원을 사용하려고 할 때
	 				허용 여부를 설정한다
	 				
	 		# 접근 제어자를 통해 구분할 수 있는 거리의 종류
	 		
	 			-	같은 클래스 내부의 다른 자원 (가장 가까운 거리)
	 			-	같은 패키지 내부의 다른 자원
	 			-	다른 패키지에 있지만 상속받은 자원
	 			-	다른 패키기의 자원 (가장 먼 거리)
	 				
	 			- 접근 제어자의 종류
	 			
	 				- private
	 					 앞에 private이 붙은 자원은 같은 클래스 내부에서만 접근할 수 있게 된다
	 					
	 				- default (아무것도 안 씀)
	 					같은 패키지 내부에서는 자유롭게 접근할 수 있다
	 					다른 패키기에서는 접근할 수 없다.
	 				
	 				- protected
	 					앞에 protected가 붙은 자원은
	 					같은 패키지 내부에서는 자유롭게 접근할 수 있고,
	 					다른 패키지에서는 상속받은 클래스만 접근할 수 있는 자원이 된다
	 					
	 				- public
	 					다른 패키지에서 자유롭게 접근할 수 있는 자원이 된다
	 					
	 					
	 */
	public static void main(String[] args) {
		C08_SamePakage instance = new C08_SamePakage();

		instance.protcted_method();
		instance.default_method();
		instance.public_method();

		DiffPackge instance2 = new DiffPackge();
		
		instance2.public_method();
		
		Coffee coffee = new Coffee(Coffee.AMRICANO, 1500, 10, 0);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, 4);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOHCA, 2500, 20, 4);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOHCA, 3500, 25, 4);
		
	}
}

class Snack {
	 int size  = 10;
	
	private void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack{
	
	private void abc() {
		System.out.println(size);
	}
}

class Choco extends DiffPackge{
	
	public Choco(){
		// protcerted :  상속 받으면 다른 패키지에서도 사용 가능
		this.protcted_method();   
	}
	
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
}