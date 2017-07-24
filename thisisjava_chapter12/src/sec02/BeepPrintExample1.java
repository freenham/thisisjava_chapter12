package sec02;

import java.awt.Toolkit;
import java.util.Calendar;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Calendar cd = Calendar.getInstance();
		
		for(int i =0;i<5;i++) {
			tk.beep();
			
//			System.out.println("땡");
			try {
				Thread.sleep(500);
				System.out.println(cd.getTimeInMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
