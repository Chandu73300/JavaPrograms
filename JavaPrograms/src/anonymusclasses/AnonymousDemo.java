package anonymusclasses;

//Java Program to Demonstrate Anonymous inner class

//Interface
interface Age1 {
	int x = 21;
	void getAge();
}

//Main class
class AnonymousDemo {

	// Main driver method
	public static void main(String[] args)
	{

		// A hidden inner class of Age interface is created
		// whose name is not written but an object to it
		// is created.
		Age1 oj1 = new Age1() {

			@Override public void getAge()
			{
				// printing  age
				System.out.print("Age is " + x);
			}
		};

		oj1.getAge();
	}
}

