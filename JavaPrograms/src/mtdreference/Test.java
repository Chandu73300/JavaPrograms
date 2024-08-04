package mtdreference;

public class Test {
	public void m1() {
		System.out.println("m1() instance/non-static methos.");
	}
	
	public static void m2() {
		System.out.println("m2() instance/non-static methos.");
	}
	
	public static void main(String[] args) {
		/* Basic method reference */
//		Test.m2();
//		
//		Test t1 = new Test();
//		t1.m1();
	}
}
