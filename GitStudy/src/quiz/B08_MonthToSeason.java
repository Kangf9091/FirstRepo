package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
		/*
		 		����ڷκ��� ���� �Է¹����� ������ ����غ�����
		 		(switch-case���� �̿�)
		 */                                                    

		Scanner sc = new Scanner (System.in);
        System.out.print("���� �Է��ϼ��� : ");
        int month = sc.nextInt();
        String season;
        
       switch(month) {
       case 12:  case  1: case 2:
    	   season = "�ܿ�";
    	   break;
       case 3: case  4: case 5:
    	   season = "��";
    	   break;
       case 6 : case  7: case 8:
    	   season = "����";
    	   break;
       case 9: case  10: case 11:
    	   season = "����";
    	   break;
    	default:
    		season = "�߸��� ����";
    		break;
    	    }
       
       System.out.printf("%d���� [%s]�Դϴ� \n", month, season);
       
       
       
       

        
	}

}