	/*	int x; // known to all code within main
		x = 10;
		if(x ==10) { // start new scope = is for ==
		int y = 20; // known only to this block // x and y both known here.
		System.out.println("x and y: " + x + " " + y);
		x = y * 2;
		}
		//y = 100; // Error! y not known here => show this !
		// x is still known here.
		System.out.println("x is " + x);
		}
	*/
	
	// Show lifetime scope
public class ScopeDemo10{
	public static void main(String args[]) {
		
		int x; // known to all code within main
		x = 10;
		if(x ==10) { // start new scope = is for ==
		int y = 20; // known only to this block // x and y both known here.
		System.out.println("x and y: " + x + " " + y);
		x = y * 2;
		}
		//y = 100; // Error! y not known here => show this !
		// x is still known here.
		System.out.println("x is " + x);
		}
		
		
		
		
	/*   int x;
		for(x = 0; x < 3; x++) {
		int y = -1; // y is initialized each time block is entered
		System.out.println("y is: " + y); // this always prints -1
		y = 100;
		System.out.println("y is now: " + y);
	}
		System.out.println("whats x" + x);
	}
*/
}

/*
 * There is one quirk to Java’s scope rules that may surprise you: although blocks can be
nested, no variable declared within an inner scope can have the same name as a variable
declared by an enclosing scope. For example, the following program, which tries to declare
two separate variables with the same name, will not compile.

class NestVar {
public static void main(String args[]) {
int count;
for(count = 0; count < 10; count = count+1) {
System.out.println("This is count: " + count);
int count; // illegal!!! ==================================>Explain
for(count = 0; count < 2; count++)
System.out.println("This program is in error!");
}
}
}

 */







