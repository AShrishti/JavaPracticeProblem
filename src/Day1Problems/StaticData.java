package Day1Problems;

public class StaticData {
	
	static int val1=10;
	
	static void printMessage() {
		
		System.out.println("static variable"+val1);
	}
	
	static
    {
        // Print statement
        System.out.println(
            "Static block is printed");
    }
	
public static void main(String[] args) {
	System.out.println(val1);
	
	printMessage();
	
}
}
