package sec04;

public class User1 extends Thread{
	private Calculator c;
	
	public void setCalulator(Calculator c) {
		this.setName("User1");
		this.c=c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.setMemory(100);
	}
}
