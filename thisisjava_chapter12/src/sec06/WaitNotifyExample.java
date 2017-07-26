package sec06;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();
		
		WaitThreadA threadA = new WaitThreadA(sharedObject);
		WaitThreadB threadB = new WaitThreadB(sharedObject);
		
		threadA.start();
		threadB.start();

	}

}
