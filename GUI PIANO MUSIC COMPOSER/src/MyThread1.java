import javax.sound.sampled.Clip;

public class MyThread1 extends Thread{

	Clip Clip1;
	
	public void run1(Clip Clip1) {
		Clip1.start();
		Clip1.setMicrosecondPosition(0);
		try {
			Thread.sleep(170);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
