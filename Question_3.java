package iNeuron_Assignment_1;

public class Question_3 {
	
	public static void main(String[] args) {
		int n=14; // Taking the number of rows
	
		for (int i=1; i<=n; i++) {
		
			// Printing the whole pattern
			for (int j=1; j<=n; j++) {
				if ((i==1 || i==n || j==1 || j==n) || ((i+j)<=((n+2)/2)) || ((j-i)>=((n-2)/2))) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(""); // Adding a next line after each row
		}

	}
}
