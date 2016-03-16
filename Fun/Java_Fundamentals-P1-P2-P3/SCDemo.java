
public class SCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, d, q;
		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
		System.out.println(d + " is a factor of " + n);
		d = 0; // now, set d to zero
		// Since d is zero, the second operand is not evaluated.
		//if(d != 0 && (n % d) == 0)
		System.out.println(d + " is a coooool    factor of " + n);
		// Now, try same thing without short-circuit operator.The short-circuit operator prevents a division by zero.
		 // This will cause a divide-by-zero error.

		if(d != 0 & (n % d) == 0)
		System.out.println(d + " is a factor of " + n);
		}

	}


