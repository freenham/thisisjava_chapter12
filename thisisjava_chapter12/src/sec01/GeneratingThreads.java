package sec01;

public class GeneratingThreads {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread thread = new Thread(task);
		GetTime gt = new GetTime();
		String str = gt.getTime();
		System.out.println(str+"이건 메인스레드");
		thread.run();
	}

}
class Task implements Runnable {
	GetTime gt = new GetTime();
	String str = gt.getTime();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(str+"task 실행");
	}
}
