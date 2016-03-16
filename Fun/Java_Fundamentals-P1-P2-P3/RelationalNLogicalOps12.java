
public class RelationalNLogicalOps12 {
	public static void main(String args[]) {
	int i, j;
		boolean b1, b2;
		i = 10;
		j = 11;
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("this won't execute");
		if(i >= j) System.out.println("this won't execute");
		if(i > j) System.out.println("this won't execute");
		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("this won't execute");
		if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
		if(b1 | b2) System.out.println("b1 | b2 is true");
		if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
		}
/*	int n, d, q;
	n = 10;
	d = 2;
	if(d != 0 && (n % d) == 0)
	System.out.println(d + " is a factor of " + n);
	d = 0; // now, set d to zero
	// Since d is zero, the second operand is not evaluated.
	if(d != 0 && (n % d) == 0)
	System.out.println(d + " is a coooool    factor of " + n);
	// Now, try same thing without short-circuit operator.The short-circuit operator prevents a division by zero.
	 // This will cause a divide-by-zero error.

	//if(d != 0 & (n % d) == 0)
	System.out.println(d + " is a factor of " + n);
	}
	
	*/
	
	
	
	
	
	
}
	/*
	 The short-circuit AND operator is &&, and the short-circuit OR operator is ||. Their normal
counterparts are & and |. The only difference between the normal and short- circuit versions is
that the normal operands will always evaluate each operand, but short-circuit versions will
evaluate the second operand only when necessary.

public static void main(String args[]) {
int n, d, q;
n = 10;
d = 2;
if(d != 0 && (n % d) == 0)
System.out.println(d + " is a factor of " + n);
d = 0; // now, set d to zero
// Since d is zero, the second operand is not evaluated.
if(d != 0 && (n % d) == 0)
System.out.println(d + " is a factor of " + n);
// Now, try same thing without short-circuit operator.The short-circuit operator prevents a division by zero.
 // This will cause a divide-by-zero error.

if(d != 0 & (n % d) == 0)
System.out.println(d + " is a factor of " + n);
}
	 */

