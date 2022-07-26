package iNeuron_Assignment_1;

public class Question_1 {
	public static void main(String[] args) {
		int n=7; // Taking the number of rows
		
		for (int i=1; i<=n; i++) {
			System.out.print("*");	// Printing "I" row wise		
			System.out.print(" ");	// Putting a space between "I" and "N"
			
			//Printing "N"
			
			for (int j=1;j<=n; j++) {
				if (i==j || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" "); // Putting a space between "N" and "E"
			
			//Printing "E"
			
			for (int j=1;j<=n;j++) {
				if (i==1 || i==n || i==((n+1)/2) || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" "); // Putting a space between "E" and "U"
			
			//Printing "U"
			
			for (int j=1;j<=n;j++) {
				if ((j==1 && i!=n) || (j==n && i!=n) || (i==n && (j!=1 && j!=n))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" "); // Putting a space between "U" and "R"
			
			
			//Printing "R"
			
			for (int j=1; j<=n; j++) {
				if (j==1 || (i==1 && j!=n) || (i== ((n+1)/2) && j!=n) || (j==n && (i>1 && i<((n+1)/2))) || (i>((n+1)/2) && (i==j))){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" "); // Putting a space between "R" and "O"
			
			
			//Printing "O"
			
			for (int j=1; j<=n; j++) {
				if ((j==1 && (i!=1 && i!=n)) || (j==n && (i!=1 && i!=n)) || (i==1 && (j!=1 && j!=n)) || (i==n && (j!=1 && j!=n))){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}				
			}
			System.out.print(" "); // Putting a space between "O" and "N"
			
			//Printing "N"
			
			for (int j=1;j<=n; j++) {
				if (i==j || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}			
			
			System.out.println(""); // Printing next line after each row
			
		}
	}

}
