package exercise5;

public class Number implements Runnable{
	private int multiple;
	
	public Number(int multiple) {
		this.multiple = multiple;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(multiple * i);
		}
	}
}
