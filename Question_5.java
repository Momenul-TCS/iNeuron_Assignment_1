package iNeuron_Assignment_1;

public class Question_5 {

	public static void main(String[] args) {
		int row=14;  // Taking the number of rows
		
		// Printing the pattern row wise.
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=row; j++) {
				if ((i==1 || i==row || j==1 ) || ((i-j)>=((row-2)/2)) || ((i+j)<= ((row+2)/2))){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println(""); // Printing a new line after each row
		}

	}

}
