package sec04;

public class User2 extends Thread{
	private Calculator c;
	public void setCalulator(Calculator c) {
		this.setName("User2");
		this.c=c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.setMemory(50);
	}
}
