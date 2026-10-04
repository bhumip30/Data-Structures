package customs;

public class ArraySum {

	public static void main(String[] args) {
		int [] arr = {4,6,7,2,5,7};
		int k = 3;
		System.out.println("Array sum: " + findArraySum(arr, k));

	}

	public static int findArraySum(int[] arr, int k) {
		if(k == arr.length) {
			return 0;
		}
		return arr[k] + findArraySum(arr, k + 1);
	}

}
