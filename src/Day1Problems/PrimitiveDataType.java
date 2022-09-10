package Day1Problems;

class PrimitiveTest {

	byte a;
	short b;
	int c;
	long d;
	float f;
	double e;
	boolean g;
	char h;

	public void printValue() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}
}

public class PrimitiveDataType {

	public static void main(String[] args) {
		PrimitiveTest obj = new PrimitiveTest();
		obj.printValue();
	}
}