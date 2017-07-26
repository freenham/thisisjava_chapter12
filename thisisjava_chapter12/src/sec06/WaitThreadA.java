package sec06;

public class WaitThreadA extends Thread {
	private WorkObject workObject;

	public WaitThreadA(WorkObject workObject) {
		this.workObject = workObject;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			workObject.calc();
		
	}

}
