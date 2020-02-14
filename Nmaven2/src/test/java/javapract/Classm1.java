package javapract;

public class Classm1 extends Thread{

	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println("from first"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
