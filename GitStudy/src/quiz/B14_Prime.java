package quiz;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		
		/*
		 		����ڷκ��� ���ڸ� �Է� ������
		 		1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		 		�� �Ҽ� : 1�� �ڱ� �ڽ����θ� ������ �������� ��
		 		ex: 7, 11, 13, 17 ....
		 */
        System.out.print("���� : ");
        int input = new Scanner(System.in).nextInt();

//          boolean prime;              ==========Ǯ�� �ٽ�
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
        
        
        for (int i = 2; i <= input; ++i) {					// i = check, j = div �ٲ㼭 �غ��� 
        	
        	int cnt = 0;
        	
        	// �˻縦 1�� �ڱ� �ڽ��� �����ϰ� �����ϸ� 
        	// cut�� �߻����ڸ��� �Ҽ��� �ƴ��� �� �� �ִ�
        	for (int j = 2; j <= Math.sqrt(i); ++j){
        		
        		if (i % j == 0) {
        			System.out.printf("�˻��ϴ�  ���ڴ� [%d]�� [%d]�� ������ ���������ϴ�.\n" , i, j);
        			System.out.printf("\t�Ҽ��� �ƴմϴ�.\n");
        			cnt ++;
        			break; //  �˻縦 �� ������ �ʿ䰡 ����
        			}
        		
        	}   	
        	
        	if (cnt == 0 ) {
        		System.out.printf("\t[%d]�� �Ҽ��Դϴ�. \n" , i);
        	}
        	System.out.println("----------------------------------");
        
        }
	}
}
	
