package sec06;

public class JoinThread {
	public static void main(String[] args) {
		SumThread st = new SumThread();
//		st.getSum();
	
		st.start();
		try {
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(st.getSum());
		System.out.println("메인스레드 종료");
	}
}
