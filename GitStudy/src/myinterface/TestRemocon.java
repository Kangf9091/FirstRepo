package myinterface;

import myobj.Remote.AriconditionRemocon;
import myobj.Remote.TelevisionRemocon;

// �������̽��� ���� ���յ��� ���� �ڵ带 �ۼ��� �� �ִ�
public class TestRemocon {
	
	public static void main(String[] args) {
		test(new AriconditionRemocon());
		test(new TelevisionRemocon());
	}

	public static void test(Remocon remocon) {
		remocon.Power();
		remocon.up(1);
		remocon.down(1);
		remocon.change();
		
	}
}
