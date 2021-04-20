package quiz;


import java.util.Scanner;

public class B17_CountRandomFruit {

	public static void main(String[] args) {

		/* 다시 연습
		 	1. 사용자로부터 배열의 크기를 입력받는다
		 	
		 	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
		  		(랜덤으로 등장하는 과일:
		  		apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  	
		  	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다        
		 */
        Scanner sc = new Scanner (System.in);

        String [] fruit  = new String[] { "apple" , "banana" , "kiwi" , "orange","strawberry","peach","pineapple"};

        System.out.print("배열 입력 >");
        int input = sc.nextInt();

	     int [] count = new int[7];
	        
	        for(int i = 0; i < input; ++ i) {
	           int j = (int)(Math.random() * fruit.length + 0);
	           String fruitName = fruit[j];
	        	   count[j]++;
	           
	           System.out.println(fruitName);
	        }
	     for(int i =0 ; i < count.length; i++){
	        System.out.println(fruit[i]+"는"+count[i]+"개 입니다");
	       }
        
        
     
     
	}
 }


