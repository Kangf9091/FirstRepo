package quiz;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		
		/*
		 		사용자로부터 숫자를 입력 받으면
		 		1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		 		※ 소수 : 1과 자기 자신으로만 나누어 떨어지는 수
		 		ex: 7, 11, 13, 17 ....
		 */
        System.out.print("숫자 : ");
        int input = new Scanner(System.in).nextInt();

//          boolean prime;              ==========풀이 다시
//          
//          for(int i = 2; i <= input; ++i){
//             prime = true;
//              for(int j = 2;  j < i; ++j){    
//                  if(i % j == 0){        
//                	  prime = false;
//                    
//                  }
//              }
//              if(prime == true){
//                  System.out.println(i);
//              }
//          }
        
        // 13 : 1 , 13
        // 30 : 1, 2, 3, 4, .....30
        
        
        for (int i = 2; i <= input; ++i) {					// i = check, j = div 바꿔서 해보기 
        	
        	int cnt = 0;
        	
        	// 검사를 1과 자기 자신을 제외하고 진행하면 
        	// cut가 발생하자마자 소수가 아님을 알 수 있다
        	for (int j = 2; j <= Math.sqrt(i); ++j){
        		
        		if (i % j == 0) {
        			System.out.printf("검사하는  숫자는 [%d]는 [%d]로 나누어 떨어졌습니다.\n" , i, j);
        			System.out.printf("\t소수가 아닙니다.\n");
        			cnt ++;
        			break; //  검사를 더 진행할 필요가 없다
        			}
        		
        	}   	
        	
        	if (cnt == 0 ) {
        		System.out.printf("\t[%d]는 소수입니다. \n" , i);
        	}
        	System.out.println("----------------------------------");
        
        }
	}
}
	
