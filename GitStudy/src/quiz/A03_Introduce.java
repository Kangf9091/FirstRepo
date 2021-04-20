package quiz;

public class A03_Introduce {  // 다시 풀기**********************

	public static void main(String[] args) {
		
		
		String banner = "========= 출력 결과 =========";
		String name = "강재선";
		int age = 33;
		String tel ="010-3071-9091";
		double bench = 80, dead = 100, squart = 120;
		String blood = "B";
		boolean lolplayer = true;
		
		
		System.out.println(banner);
		System.out.println();
		System.out.println("이름\t: " + name);
		System.out.println("나이\t : "+ age);
		System.out.println("tel\t : "+ tel);
		System.out.println("3대측정\t : [" + bench + "/" + dead + "/" + squart + " ]" );
		System.out.println("혈액형\t : "+ blood);
		System.out.println("롤함\t : "+ lolplayer);
		
		
	}

}
