
/***
	 * This program plays the game "Fizzbuzz".  It counts to 50, replacing each
	 * multiple of 3 with the word "fizz", each multiple of 5 with the word "buzz",
	 * and each multiple of both with the word "fizzbuzz".  It uses the modulo
	 * operator (%) to determine if a number is divisible by another.
	 **/
	public class FizzBuzz {                      // Everything in Java is a class
	  public static void main(String[] args) {   // Every program must have main()
	    for(int i = 1; i <= 50; i++) {                    // count from 1 to 100
	      if (((i % 3) == 0) && ((i % 5) == 0))            // A multiple of both?
	        System.out.println("fizzbuzz");    
	      else if ((i % 3) == 0) System.out.println("fizz"); // else a multiple of 3?
	      else if ((i % 5) == 0) System.out.println("buzz"); // else a multiple of 5?
	      else System.out.println(i);                        // else just print it
	      //System.out.println(" "); 
	    }
	    System.out.println();
	  }
	}

