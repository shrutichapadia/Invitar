
/* This program demonstrates the difference between
public and private.
*/
class Test4 {
int a; // default access
public int b; // public access
private int c; // private access
// methods to access c
private int swapna;

public int getSwapna() {
	return swapna;
}
public void setSwapna(int swapna) {
	this.swapna = swapna;
}
void setc(int i) {
	
	// set c's value
	if(i==0) i=1;
	
c = i;


}
int getc() { // get c's value
return c;
}



}

class AccessTest {
public static void main(String args[]) {
Test4 ob = new Test4();
// These are OK, a and b may be accessed directly
ob.a = 10;
ob.b = 20;

//ob.c=0; 
ob.setc(0);
int k=10/ob.getc();
System.out.println("Lets see" + k);

// This is not OK and will cause an error
//ob.c = 100; // Error!
// You must access c through its methods
 // OK
System.out.println(" c: " + "" + " " +"" + " " + ob.getc());
}
}

