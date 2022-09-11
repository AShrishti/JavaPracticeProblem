package Day3Problems;

public class SmallInArray {

	
	public static void main(String[] args) {

		int[] arr = { 62, 45, 67, 78, 99, 44, 78 };

		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.print("largest number is:  " + smallest);

	}
}
