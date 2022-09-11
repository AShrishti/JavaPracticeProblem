package Day3Problems;

public class LargeInArray {

	public static void main(String[] args) {

		int[] arr = { 32, 45, 67, 78, 99, 44 };

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.print("largest number is:  " + largest);

	}

}
