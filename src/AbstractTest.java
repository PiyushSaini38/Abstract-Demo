//Java program to demonstrate abstract class

abstract class AbstractExample {

	// abstract method(can't define its implementation)
	abstract void show();

	// concrete method(user-defined)
	void display() {
		System.out.println("This is concrete method.");
	}

}

public class AbstractTest extends AbstractExample {

	@Override
	void show() {
		System.out.println("Override show method in child class");

	}

	public static void main(String[] args) {
		// can't make object of Abstract class
		// this will throw compile-time error
		// AstractExample ab = new AbstractExample();
		// you can use it as a reference variable
		AbstractExample abst = new AbstractTest();
		abst.display();
		abst.show();
	}

}