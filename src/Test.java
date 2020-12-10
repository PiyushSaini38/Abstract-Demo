//Java program to demonstrate abstract class properties
abstract class AbstractDemo {

	int x;

	// default constructor of abstract class
	public AbstractDemo() {
		System.out.println("Abstract class default constructor");
	}

	// parameterized constructor to initialize values
	AbstractDemo(int x) {
		this.x = x;
	}

	// concrete method with implementation
	void display() {
		System.out.println("Hello from concrete method in abstract class");
	}

	// static method
	static void print() {
		System.out.println("Hello from static method in abstract class");
	}

	// abstract method
	abstract void hello();
}

// Child class extending Abstract class to 
// provide implementation details to abstract method
public class Test extends AbstractDemo {

	// child class default constructor
	Test() {
		System.out.println("Test class default constructor");
	}

	// parameterized constructor
	Test(int x) {
		// using super to pass parameter for
		// parameterized constructor in abstract class
		super(x);
	}

	// provide implementation detail to abstract method
	@Override
	void hello() {
		System.out.println("Override the abstract method in child class");
	}

	public static void main(String[] args) {
		// child class reference and object of Test class
		Test t = new Test();
		// invoking concrete method using child class reference
		t.display();
		// invoking static method using child class reference
		t.print();
		// invoking abstract method using child class reference
		t.hello();

		// reference of abstract class and object of Test class
		// passing parameter
		AbstractDemo a = new Test(10);
		System.out.println("Value of x  using abstract class reference " + a.x);
		// invoking concrete method using abstract class reference
		a.display();
		// invoking static method using abstract class reference
		a.print();
		// invoking abstract method using abstract class reference
		a.hello();
		// you can also invoke static method using abstract class ClassName
		AbstractDemo.print();

	}

}
