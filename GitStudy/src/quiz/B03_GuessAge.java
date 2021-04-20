package quiz;

import java.util.Scanner;

public class B03_GuessAge {
	// 사용자로부터 태어난 해와 올해의 년도를 입력 받으면
	// 그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을
	// 만들어보세요
	
			public static void main(String[] args) {
				
				Scanner sc = new Scanner (System.in);
			
				System.out.print("태어난 해 :  ");
				 int birth_year = sc.nextInt();
					System.out.print("올해의 년도 : ");
					 int this_year = sc.nextInt();
					 
					 System.out.println("입력하신 나이는 " + (this_year - birth_year+1) +"살입니다");

					 
					 
					 
					 
					 
					 
					 
					 
	}

}
