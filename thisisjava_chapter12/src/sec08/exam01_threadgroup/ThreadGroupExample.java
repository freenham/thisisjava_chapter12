package sec08.exam01_threadgroup;

public class ThreadGroupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

		workThreadA.start();
		workThreadB.start();

		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		myGroup.interrupt();
	}
}