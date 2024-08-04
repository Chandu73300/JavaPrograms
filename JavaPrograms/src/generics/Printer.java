package generics;

public class Printer<T> {
	private T message;

	public Printer(T msg) {
		this.message = msg;
	}
	
	public void print() {
		System.out.println(message);
	}
}
