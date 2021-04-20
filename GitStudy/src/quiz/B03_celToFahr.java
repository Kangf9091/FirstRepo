package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		// 사용자로부터 섭씨 온도를 입력 받으면
		// 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		// (변환 공식은 구글 검색, 출력은 소수 첫째 자리까지)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("섭씨 온도를 입력하세요 > ");	
		int cel = sc.nextInt();
		
		double fah = cel * 1.8 + 32;
		
		System.out.println(Math.round(fah * 10) / 10.0 + "ºF");
		
		System.out.printf("섭씨 온도 %dºC를 화씨 온도로 변환하면 %.1fºF 입니다" , cel , fah);

		
		
//		System.out.print("섭씨(℃) 온도를 입력하세요 > ");	
//		
//		double cel;
//		double fahr;
//		
//		fahr = (cel * 9/5) + 32;
// 		
//		System.out.printf("%.1f℃는 %.1f℉ 입니다.\n " , cel , fahr);
		

	}

}
