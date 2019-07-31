package helpers;

public class Helpers {

	
		public void sleepSeconds(int seg) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(seg*1000);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
}
