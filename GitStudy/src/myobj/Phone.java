package myobj;

public class Phone {
	
	public String model;
	int num;
	public double weight;
	public String color;
	int size = 10;
	int camCnt = 3;
		public	void lostCase() {
		weight -- ;
		color = "black";
	}
		
	public void lost() {
		weight = 0;
		model = "null";
		}
	public Phone(){
		}
	public Phone(int size) {
		this.size = size;
	}
	public Phone(int size, int camCnt) {
		this.size = size;
		this.camCnt = camCnt;
	}
}

