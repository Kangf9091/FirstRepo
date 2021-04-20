package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
		/*
        [ �˸��� �񱳿����� �������� ]
            
        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
        2. int�� ���� b�� ¦���� �� true                
        3. int�� ���� c�� 7�� ����� �� true
        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
        5. int�� ���� d�� e�� ���̰� 30�� �� true                
        6. int�� ���� year�� 400���� ������ �������ų�  
           �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
        7. �μ��� ö������ 2�� ������ true
        8. �μ��� ö������ ������ 3�� ������ true  
         9. boolean�� ���� powerOn�� false�� �� true
        10. ���ڿ� �������� str�� "yes"�� �� true
*/        
		int a = 11 , b = 60, c = 14, d = 60, e = 30 , hour =25, year =12 ;
		int minsu_age = 20;
		int chulsu_age = 17;
		int minsu_month = 12;
		int chulsu_month = 9;
		boolean powerOn = false;
		String str = "yes";
		
		
		// �񱳸� �� �� ������ ���ʿ� �ִ� ���� ����
		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(!(hour < 0 && hour > 24) && hour >12); //     (!(hour < 0 || hour >= 24) && >= 12)
		System.out.println(Math.abs(d) - Math.abs(e) == 30); // (d-e=30 || e-d=-30)
		System.out.println(year % 400 ==0 && year % 4 == 0 || year % 100 != 0);
		System.out.println(!(year % 400 == 0 || hour >= 24) && hour >= 12);
		System.out.println(minsu_age - chulsu_age == 2);  // c+2  == m
		System.out.println(chulsu_month - minsu_month ==3 ); // m+3 = c
		System.out.println(powerOn == false); // (!powerOn) ������ �ٷ� ����
		
		//  *���ڿ���(������ Ÿ��)��  ==���� ���ϸ� �ȵȴ�.
		//	 	������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ� equals()���
		//		�޼��带 �̿��ؾ� �Ѵ�
	
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));//�޼���
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ������         ----------------------- ���� �ٽ� �����ϱ�--------------------
		// - �⺻ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����
		//	(�������� ���̴� �޸𸮸� ����Ѵ�, Stack)
		// - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�
		//	(�������� �� ���� �޸𸮸� ����Ѵ�, Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";

		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2)  : " + str1.equals(str2));
		System.out.println("str1 == str3 : " + (str1 == str3));

		
		
		
	}

}
