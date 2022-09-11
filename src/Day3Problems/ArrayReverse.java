package Day3Problems;

public class ArrayReverse {
	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1, 5 };
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}

	}
}
