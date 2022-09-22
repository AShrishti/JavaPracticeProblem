package Day13PracticeProblems;

public class CompareToInteger {

	public static int maximum(int a, int b, int c) {

		Integer num1 = Integer.valueOf(a);
		Integer num2 = Integer.valueOf(b);
		Integer num3 = Integer.valueOf(c);
		// Integer num4 = new Integer(19);
		int max = num1; // assume num1 is initially the largest

		if (num2.compareTo(max) > 0)
			max = num2; // num2 is the largest so far

		if (num3.compareTo(max) > 0)
			max = num3; // num3 is the largest
		return max;
	}

	public static String maximum(String a, String b, String c) {

		String max = a; // assume a is initially the largest

		if (b.compareToIgnoreCase(max) > 0)
			max = b; // b is the largest so far

		if (c.compareToIgnoreCase(max) > 0)
			max = c; //  is the largest

		return max;
	}

	public static void main(String[] args) {

		int maxInt = CompareToInteger.maximum(10, 29, 39);
		String maxString = CompareToInteger.maximum("apple", "Peach", "Banana");
		System.out.println(maxInt + " is the maximum of all Integers");
		System.out.println(maxString + " is the maximum of all input String");
	}
}
