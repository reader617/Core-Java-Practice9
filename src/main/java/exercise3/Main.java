package exercise3;

public class Main {

	public static void main(String[] args) {
		DemoThread1 d1 = new DemoThread1();
		DemoThread1 d2 = new DemoThread1();
		DemoThread1 d3 = new DemoThread1();
		d1.run();
		d2.run();
		d3.run();

	}

}
