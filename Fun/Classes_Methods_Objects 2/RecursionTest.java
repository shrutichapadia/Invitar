class Recursion {
int values[];
Recursion(int i) {
values = new int[i];
}
// display array -- recursively
void printArray(int i) { // printArray(10), printArray(9),, ......printArray(0)
if(i==0) return;
else printArray(i-1);

System.out.println("[" + (i-1) + "] " + values[i-1]);
}
}
class RecursionTest {
public static void main(String args[]) {
	Recursion ob = new Recursion(10);
int i;
for(i=0; i<10; i++) 
	ob.values[i] = i;


ob.printArray(10);
}
}
