package exercise5;

public class Main {

	public static void main(String[] args) {
		Number n1 = new Number(2);
		Number n2 = new Number(5);
		Number n3 = new Number(10);
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		Thread t3 = new Thread(n3);
		
		
		System.out.println("Status of thread1: " + t1.getState());
		t1.run();
		System.out.println("Status of thread1: " + t1.getState());
		System.out.println("Status of thread2: " + t2.getState());
		t2.run();
		System.out.println("Status of thread2: " + t2.getState());
		System.out.println("Status of thread3: " + t3.getState());
		t3.run();
		System.out.println("Status of thread3: " + t3.getState());

	}

}
