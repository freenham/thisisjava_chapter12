package sec03;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
		
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0;i<2000000000;i++) {
			sum+=i;
			for(int j =0;j<1;j++) {
				
			}
		}
		
		System.out.println(getName()+" "+getPriority());
	}

}
