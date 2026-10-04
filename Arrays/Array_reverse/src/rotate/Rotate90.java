package rotate;

public class Rotate90 {
	
	public static void RotateClockwise(int[] [] arr) {
		//Transpose of array
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//Reverse each row
		for(int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;
		
			while(start < end) {
				int temp1 = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp1;
			
				start++;
				end--;
		}
		}
	}

	public static void main(String[] args) {
		int[] [] arr = {
			{5,6,8},
			{9,6,8},
			{9,4,6}
		};
		
		RotateClockwise(arr);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j] + " ");
			}
			 System.out.println();
		}
	}

}
