package quiz;

public class B16_TempPassword {

	public static void main(String[] args) {
	
		/*
		 		4�ڸ� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������
		 		(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)
		 		// A~Z 0~9
		 */  //--------------�ٽ��ϱ� ������ ����
		
	
        StringBuilder tempPassword = new StringBuilder();
        int size = 4;
        
        for (int i = 0; i < size; ++i) {                        
                switch ((int)(Math.random() * 2)) {
                case 0:
                        tempPassword.append((char)(Math.random() * 26 + 'A'));
                        break;
                case 1:
                        tempPassword.append((char)(Math.random() * 10 + '0'));
                        break;                                
                }
        }
        
        System.out.println("�ӽ� ��й�ȣ: " + tempPassword.toString());
        
}


			
			//System.out.println((char)(Math.random() * 25 + 65)) ;
			//System.out.println((int)(Math.random() * 9 + 1)) ;
				
			
			//System.out.println((char)(Math.random() * 90 + 66));
		}

		
	

	
