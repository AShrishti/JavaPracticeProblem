package Day13PracticeProblems;

public class CompareToInteger {

	
	public static <T extends Comparable<T>> T maximum(T a, T b,T c) {

		T max = a; // assume a is initially the largest

		if (b.compareTo(max) > 0)
			max = b; // b is the largest so far

		if (c.compareTo(max) > 0)
			max = c; //  is the largest

		return max;
	}

	public static void main(String[] args) {

		int maxInt = maximum(10, 29, 39);
		String maxString = maximum("apple", "Peach", "Banana");
		double maxFloat= maximum(1.0,4.5,8.8);
		System.out.println(maxInt + " is the maximum of all Integers");
		System.out.println(maxString + " is the maximum of all input String");
		System.out.println(maxFloat + " is the maximum of all input value");
	}
}
