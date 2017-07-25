package sec04;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalulator(c);
		u1.start();
		
		User2 u2 = new User2();
		u2.setCalulator(c);
		u2.start();
	}

}
