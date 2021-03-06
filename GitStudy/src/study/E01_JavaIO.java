package study;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
	 	# JAVA I/O(Input/Output)
	 	
	 	 - 자바는 스트림이라는 개념을 이용해 입출력을 다룬다
	 	 - 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다 (Input)
	 	 - 프로그램이 연산해서 내보내는 모든 데이터들을 출력이라고 부른다(Output)
	 	 
	 	# Stream
	 	
	 	 - 데이터들이 오고가는 통로
	 	 - 입력 받을 때 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다
	 	 - 출력 할 때 데이터들이 나가는 통로를 OupputStream이라고 부른다
	 	 - 데이터가 Stream으로 이동하기 위해서는 해당 데이터를 byte 타입으로 변환되어야 한다
	 */
	public static void main(String[] args){
		
		FileOutputStream fout = null;
		try {
			/*
			   	# 절대 경로와 상대 경로
			   	
			   	 - 원하는 자원까지의 경로를 뿌리(root)부터 모두 적는 것을 절대 경로라고 한다
			   	   (C:\, D:\, E:\, http://, ftp://, file://,/)
			   	   
			   	 * 절대경로 예
			   	   - D:\Pictures\animals\penguin.jpg
			   	   - https://upload.wikimedia.org/wikipedia/commons/7/76/Antarctica_2013_Journey_to_the_Crystal_Desert_%288370623298%29.jpg
			 
			 	 - 원하는 자원까지의 경로를 현재 위치부터 찾아가는 것을 상대경로라고 한다
			 	   상대 경로는 반드시 ./로 시작한다
			 	   
			 	   (./)	: 현재 위치부터 시작
			 	   (./)../: 상위 폴더
			 	   
			 	   * 상대경로 예
			 	   - ./../../penguin.jpg
			 	   - ./../images/penguin.jpg
			 */
			
			// 소스에서는 현재 위치(./)는 프로젝트의 root이다
			fout = new FileOutputStream(".b.txt", true);
			
			for(int i = 0; i < 10; ++i) 
				fout.write(String.format("오늘은 날씨가 참 좋네요 ..%d\n", i).getBytes());
			
			// I/O Stream은 수동으로 close()를 호출해줘야 한다 (메모리 회수)
			// fout.close();
			
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음 익셉션");
		} catch (IOException e) {
			System.out.println("데이터를 쓰다가 문제가 생겼음");
		} finally {
			try {
				if(fout != null) fout.close();
			} catch(IOException e) {}
		}
	}
}
