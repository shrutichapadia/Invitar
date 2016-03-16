
public class PowerOfTwo {
	// Compute integer powers of 2.
	
	public static void main(String args[]) {
	int e;
	int result;
	for(int i=0; i < 10; i++) {
	result = 1;
	e = i;
	while(e > 0) {
	result *= 2;
	e--;
	}
	System.out.println("2 to the " + i +" power is " + result);
	}
	}
	

	//Notice that the while loop executes only when e is greater than 0. Thus, when e is zero, as it is
	//in the first iteration of the for loop, the while loop is skipped.


}
