package sec04;

public class Calculator {
	private int memory;

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
		synchronized(this){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
	
}
