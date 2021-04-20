package myobj.school;

import java.util.Random;

public class Student2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private static Random ran = new Random();
	private static int sno = 0;
	
	public static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101);
	}
	public Student2() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		math = ran.nextInt(101);
		name = String.format("학생%06d",  sno++);
		BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
		
//		int total = getTotal();											Math랑 비슷함
//		BEST_TOTAL = getTotal() > BEST_TOTAL ? getTotal() : BEST_TOTAL;
				
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAvg() {
		return getTotal() / 3.0 ;
	}
	
	public String getTranscript() {
		
//		System.out.printf("서식 %d ", 10); 						format이랑 비슷함
//		String str = String.format("서식 %d", 10)
//		return str;
		
		return String.format("%s\t /%d\t/ %.2f ", name, getTotal(), getAvg());
		
	}

}
