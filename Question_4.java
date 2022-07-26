package iNeuron_Assignment_1;

public class Question_4 {

	public static void main(String[] args) {
		int row=14; // Taking the number of rows
		
		//Printing values row wise
		
		for (int i=1;i<=(row/2);i++) {
			
			// Printing the first triangle
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// Printing the spaces
			
			int space= row-2*i;
			
			while(space>0) {
				System.out.print(" ");
				space--;
			}
			
			// Printing the second triangle
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			
			System.out.println(""); // Printing a new line after each row
		}
		
		// Printing the last line only
		
		for (int k=1; k<=row; k++) {
			System.out.print("*");
		}

	}

}
