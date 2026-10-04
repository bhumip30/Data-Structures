package transpose;

public class ArrayTranspose {
	
	   public static void main(String[] args) {
	    
	       int[][] input = {
	           {1, 2, 3},
	           {4, 5, 6},
	           {7, 8, 9}
	       };
	      
	       int rows = input.length;
	       int cols = input[0].length;
	      
	      
	       int[][] output = new int[cols][rows];
	      
	     
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < cols; j++) {
	               output[j][i] = input[i][j];
	           }
	       }
	      
	     
	       System.out.println("Input Matrix:");
	       for (int i = 0; i < cols; i++) {
	           for (int j = 0; j < rows; j++) {
	               System.out.print(input[i][j] + " ");
	           }
	           System.out.println();
	       }
	       System.out.println();
	      
	       System.out.println("Output Matrix:");
	       for (int i = 0; i < cols; i++) {
	           for (int j = 0; j < rows; j++) {
	               System.out.print(output[i][j] + " ");
	           }
	           System.out.println();
	       }
	   }
}
