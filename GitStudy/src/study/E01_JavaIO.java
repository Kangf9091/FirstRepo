package study;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
	 	# JAVA I/O(Input/Output)
	 	
	 	 - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ������� �ٷ��
	 	 - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ��� (Input)
	 	 - ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ���(Output)
	 	 
	 	# Stream
	 	
	 	 - �����͵��� ������ ���
	 	 - �Է� ���� �� �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	 	 - ��� �� �� �����͵��� ������ ��θ� OupputStream�̶�� �θ���
	 	 - �����Ͱ� Stream���� �̵��ϱ� ���ؼ��� �ش� �����͸� byte Ÿ������ ��ȯ�Ǿ�� �Ѵ�
	 */
	public static void main(String[] args){
		
		FileOutputStream fout = null;
		try {
			/*
			   	# ���� ��ο� ��� ���
			   	
			   	 - ���ϴ� �ڿ������� ��θ� �Ѹ�(root)���� ��� ���� ���� ���� ��ζ�� �Ѵ�
			   	   (C:\, D:\, E:\, http://, ftp://, file://,/)
			   	   
			   	 * ������ ��
			   	   - D:\Pictures\animals\penguin.jpg
			   	   - https://upload.wikimedia.org/wikipedia/commons/7/76/Antarctica_2013_Journey_to_the_Crystal_Desert_%288370623298%29.jpg
			 
			 	 - ���ϴ� �ڿ������� ��θ� ���� ��ġ���� ã�ư��� ���� ����ζ�� �Ѵ�
			 	   ��� ��δ� �ݵ�� ./�� �����Ѵ�
			 	   
			 	   (./)	: ���� ��ġ���� ����
			 	   (./)../: ���� ����
			 	   
			 	   * ����� ��
			 	   - ./../../penguin.jpg
			 	   - ./../images/penguin.jpg
			 */
			
			// �ҽ������� ���� ��ġ(./)�� ������Ʈ�� root�̴�
			fout = new FileOutputStream(".b.txt", true);
			
			for(int i = 0; i < 10; ++i) 
				fout.write(String.format("������ ������ �� ���׿� ..%d\n", i).getBytes());
			
			// I/O Stream�� �������� close()�� ȣ������� �Ѵ� (�޸� ȸ��)
			// fout.close();
			
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã�� �ͼ���");
		} catch (IOException e) {
			System.out.println("�����͸� ���ٰ� ������ ������");
		} finally {
			try {
				if(fout != null) fout.close();
			} catch(IOException e) {}
		}
	}
}
