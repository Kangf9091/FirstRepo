package myobj.school;

import java.util.Random;


public abstract class Student {
	
	final static String [] lastNameList = {"강", "고", "구", "권", "김", "나", "박", "최", "오",
			"제갈", "독고", "이", "신", "차", "남궁", "배", "서", "안", "임" };
	
	final static String [] firstNameList  = {
			"태현", "태환", "태영", "태희", "재선", "유미"};
	
	String name;
	int sno;
	int kor;
	int eng;
	
	Random ran;
	
	public Student(int sno) {
		this.sno = sno;
		
		ran = new Random();
		
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomName();
	}

	public abstract void printGradeCard();
	
	int getRandomScore() {
		return ran.nextInt(101);
	}
	String getRandomName() {
		return lastNameList[ran.nextInt(lastNameList.length)]
					+ firstNameList[ran.nextInt(firstNameList.length)];
	}
	
}
