package sec06;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			if(work) {
				System.out.println("스레드A 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("스레드A 종료");
	}
}
