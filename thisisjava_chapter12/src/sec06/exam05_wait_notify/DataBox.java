package sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	/**
	 * @return the data
	 */
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: "+returnValue);
		data = null;
		notify(); 
		
		return returnValue;
	}

	/**
	 * @param data the data to set
	 */
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: "+data);
		notify();
	}
	
	

}
