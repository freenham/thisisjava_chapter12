package sec01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
	
	String getTime() {
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		long time = System.currentTimeMillis(); 

		String str = dayTime.format(new Date(time));
		return str;
	}
	
}
