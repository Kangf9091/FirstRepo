package study;

public class C12_Interface {
	/*
	 		# �������̽� (Interface)
	 		
	 			- abstract class�� ����� ������ ���� �� ���ٴ� ������ ������ ��
	 			- �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�
	 			- �������̽� ������ ������ �ڵ����� final abstract�� �ȴ�
	 			- �������̽� ������ �޼��带 �����Ҷ� default�� ���̸� �⺻ ������ ������ �� �ִ�
	 */

	public static void main(String[] args) {
		new OrangeTree().click();
	}
	
}

interface CanClick {
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻����. " 
										+ "(�������̵��ؼ� ������ּ���)");
	}
}
interface CanPunch{
	abstract public void punch();           // ���� �ٽ� Ȯ���ϱ�
}

class OrangeTree implements CanClick , CanPunch {

	@Override
	public void punch() {
		}
	@Override
	public void click() {
		System.out.println("������ �������� Ŭ�� ����");
	}
}
	
	
