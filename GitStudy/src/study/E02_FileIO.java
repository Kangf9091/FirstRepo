package study;
import java.io.File;

public class E02_FileIO {

		
		/*
		 	# java.util.File
		 	
		 	 - 파일 시스템의 파일 정보를 담을 수 있는 클래스
		 	 
		 */
	public static void main(String[] args) {
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("D:/files/");
		File dir2 = new File("D:/images/");
		
		
		System.out.println("읽기 권한이 있는 파일인가요? " + a.canRead());
		System.out.println("실행 권한이 있는 파일인가요? " + a.canExecute());
		System.out.println("쓰기 권한이 있는 파일인가요? " + a.canWrite());
		
		// 절대 경로 알아오기
		System.out.println(a.getAbsolutePath());
		
		// a에 담긴 경로가 절대 경로인가?
		System.out.println(a.isAbsolute());
		
		// a에 담긴 파일 인스턴스는 디텍토리인가?
		System.out.println("Is a directory? " + a.isDirectory());
		System.out.println("Is dir directory? " + dir.isDirectory());
		
		System.out.println("a가 현재 존재하는가? " + a.exists());
		System.out.println("dir가 현재 존재하는가? " + dir.exists());
		System.out.println("dir2가 현재 존재하는가? " + dir2.exists());
		
		
		//존재하지 않으면 디텍토리 생성하기
		if(!dir2.exists()) {
			dir2.mkdir(); // mkdir(): 디텍토리 생성 메서드
		}else {
			
		}
	}
	
}
