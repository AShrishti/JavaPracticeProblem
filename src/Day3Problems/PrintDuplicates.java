package Day3Problems;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {

		Set<Integer> duplicates = new HashSet<Integer>();
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1, 5 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {

					duplicates.add(arr[j]);
					break;
				}

			}

		}
		System.out.println("duplicates elements are :" + duplicates);

	}
}