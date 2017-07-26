package sec06;

public class WorkObject {
	private int sum;

	public synchronized void calc() {
		for (int i = 0; i <= 10; i++) {
			sum += i;

			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void print() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("계산 과정: " + this.sum);
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
