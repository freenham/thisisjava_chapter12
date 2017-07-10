package sec06.exam06_stop_flag;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		/*try {
			while (true) {
				System.out.println("실행중 ");
				Thread.sleep(1);

			}
		} catch (Exception e) {
			System.out.println("자원 정리");
			System.out.println("실행 종료");
		}*/
		while(true) {
			System.out.println("실행 중");
			if(isInterrupted()) {
				break;
			}
		}
	}

}
