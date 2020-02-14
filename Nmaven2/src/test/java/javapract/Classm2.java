package javapract;

public class Classm2 extends Thread{
public void run() {
	for(int j=0;j<=5;j++) {
		System.out.println("from second"+j);
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
