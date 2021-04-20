package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		
		/*
		 		점수를 입력 받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.

		 		 		90이상 : A등급
				 		80이상 : B등급
		 				70이상 : C등급
		 				60이상 : D등급
		 				그 외 : F등급
		 				
		 			* 유효한 점수는 0 ~ 100점 입니다.

*/
		
		// int score = 61;
		Scanner sc = new Scanner (System.in); 
		//int score = Scanner sc = new Scanner (System.in).nextInt();
		//char grade = 'F';
		//동영상 참조해서 다시 만들어보기 grade
		
		System.out.print("점수를 입력해 주세요 > ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수 입니다");
		} else if (score >= 90) {
			System.out.printf("%d점 A등급입니다\n",score);
		} else if (score >= 80) {
			System.out.println("B등급입니다");
		} else if (score >= 70) {
			System.out.println("C등급입니다");
		} else if (score >= 60) {
			System.out.println("D등급입니다");
		} else {
			System.out.println("F등급입니다");
		}
		System.out.println(); // %d %c 입니다
 		
	
	}

}
