package sec06;

public class WaitThreadB extends Thread {
	private WorkObject workObject;

	public WaitThreadB(WorkObject workObject) {
		this.workObject = workObject;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			workObject.print();
	}

}
