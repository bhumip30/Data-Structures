package sorting;

import java.util.Arrays;

public class BinarySort {

	public static void main(String[] args) {
		int arr[] = {5,3,4,8,2};
		
		int n = arr.length;
		
		boolean swapped = false;
		
		for(int i = 0; i < n - 1; i++) { //Number of passes
			for(int j = 0; j < n - i - 1; j++) { //Number of comparison
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				swapped = true;
			}
			if(!swapped) 
				break;
		}
		System.out.println(Arrays.toString(arr));

	}

}
