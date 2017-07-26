package sec06;

public class SumThread extends Thread{
	private int sum;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<=100;i++) {
			sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int getSum() {
		return sum;
	}

}
