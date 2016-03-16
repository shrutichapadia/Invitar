import java.util.Scanner;

public class KeyBoardInput {
	
		public static void main(String args[]) throws java.io.IOException {
		char ch; 
		String s; 
		int n;
		System.out.print("Press a key followed by ENTER: ");
		ch = (char) System.in.read(); // get a char
		System.out.println("Your key is: " + ch);
		
		 Scanner in = new Scanner(System.in);	
		System.out.println("Enter the number");
	     // Scanner in = new Scanner(System.in);		
		
	      n = in.nextInt();
	      System.out.println("You entered: " + n);
		
		//Scanner in = new Scanner(System.in);	
	      System.out.println("Enter the String:");
	      s=in.next();
		System.out.print("String entered: " + s);
				
		}
}


