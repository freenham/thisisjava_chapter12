package sec06;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i = 0;i<10;i++) {
			tk.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
