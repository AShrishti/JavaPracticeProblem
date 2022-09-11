package Day3Problems;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int total = 0;
		int[] arr = { 32, 45, 67, 78, 99, 44 };

		Arrays.sort(arr); // ascending order

		total = arr.length;
		System.out.println(arr[total - 2]); // length-1 = last/largest element

		// for(int n: arr)
		// System.out.print(n + " ");

	}
}
