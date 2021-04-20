package quiz;



import java.util.Scanner;

import myobj.tong.Barrel;

public class C07_PirateGame {
	
	/*
	 	1. �÷��̾ ���ư��鼭 ���ϴ� ���� Į�� ���
	 	
	 	2. �߸��� ���� Į�� ������ ���� �������� ���ư��� ������ �й��Ѵ�
	 */
	Scanner sc;
	
	Barrel barrel;
	int mode;
	
	int turn;
	int numOfPlayer;
	
	
	boolean game_over;
	
	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
	}
	
	public C07_PirateGame(int mode, int numOfPlayer) {
		this(mode);
		this.numOfPlayer = numOfPlayer;
	}
	
	
	public void start() {
		switch(this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default :
			System.out.println("���� �������� ���� ���");
			break;
		}
	}
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while(true) {
			System.out.println((turn + 1) + "�� > ");
			System.out.print("Player" + (turn % numOfPlayer + 1) + " �� ����");
			int slot = sc.nextInt();
		
			boolean fork_result = barrel.fork(slot);
			if(fork_result) {
				
				if(barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�");
					System.out.println("Player" + (turn % numOfPlayer + 1) + " �� �й�!");
					break;
				}
			turn++;
		}
	}
}
	
	void pvc() { //���� �غ���
		
	
	}
	
	public static void main(String[] args) {
		C07_PirateGame testGame =  new C07_PirateGame(99);  //(99) �⺻ �θ� (99,3) 3��
		
		
		//testGame.info();
		testGame.start();
		testGame.config(0);    //  ���� �ٲٱ�
		testGame.start();
		
		System.out.println("�׽�ũ ���� ��");
		
	}
	
}
