package ArraySort;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int [] arr1 = {3,5,7,8};
		int [] arr2 = {6,8,9,68,90};
		
		int []mergedArray = new int[arr1.length + arr2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				mergedArray [k++] = arr1[i++]; 
			}else {
				mergedArray [k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}
		
		while(j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		
		
		System.out.println(Arrays.toString(mergedArray));

	}

}
