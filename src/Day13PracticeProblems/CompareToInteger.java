package Day13PracticeProblems;

public class CompareToInteger {

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(29);
		Integer num3 = Integer.valueOf(11);

		int max = num1; // assume num1 is initially the largest

		if (num2.compareTo(max) > 0)
			max = num2; // num2 is the largest so far

		if (num3.compareTo(max) > 0)
			max = num3; // num3 is the largest

		System.out.println(max + " is the maximum of all");
	}
}
