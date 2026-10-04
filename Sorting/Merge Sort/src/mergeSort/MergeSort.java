package mergeSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int []arr = {2,34,54,65,45,32,89,67};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void mergeSort(int []arr, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			arraySort(arr, left, mid, right);
		}
	}
	
	public static void arraySort(int [] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = arr[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			arr2[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k++] = arr1[i++];
			}else {
				arr[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length) {
			arr[k++] = arr1[i++];
		}
		
		while(j < arr2.length) {
			arr[k++] = arr2[j++];
		}
	}

}
