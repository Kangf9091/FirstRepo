package quiz;


import java.util.Scanner;

public class B17_CountRandomFruit {

	public static void main(String[] args) {

		/* �ٽ� ����
		 	1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
		 	
		 	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
		  		(�������� �����ϴ� ����:
		  		apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  	
		  	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���        
		 */
        Scanner sc = new Scanner (System.in);

        String [] fruit  = new String[] { "apple" , "banana" , "kiwi" , "orange","strawberry","peach","pineapple"};

        System.out.print("�迭 �Է� >");
        int input = sc.nextInt();

	     int [] count = new int[7];
	        
	        for(int i = 0; i < input; ++ i) {
	           int j = (int)(Math.random() * fruit.length + 0);
	           String fruitName = fruit[j];
	        	   count[j]++;
	           
	           System.out.println(fruitName);
	        }
	     for(int i =0 ; i < count.length; i++){
	        System.out.println(fruit[i]+"��"+count[i]+"�� �Դϴ�");
	       }
        
        
     
     
	}
 }


