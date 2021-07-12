package exercise1;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ThreadPractice extends Thread{
	

	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1 = Thread.currentThread();
		t1.setName("myThread");
		System.out.println(t1.getName());
		
		long startTime, endTime, execTime;
		startTime = System.currentTimeMillis();
		endTime = System.currentTimeMillis();
		execTime = (endTime - startTime) / 1000;
		
		System.out.println("Time: " + execTime);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		startTime = System.currentTimeMillis();
		endTime = System.currentTimeMillis();
		execTime = (endTime - startTime) / 1000;
		
		System.out.println("Time: " + execTime);
	}

}
