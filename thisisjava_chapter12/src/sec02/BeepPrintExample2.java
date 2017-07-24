package sec02;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Thread BeepThread = new BeepThread();
		BeepThread.start();
		for(int i = 0;i<5;i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
