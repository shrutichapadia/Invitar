package classesMethodsObjectsExamples;
class Ternary {
public static void main(String args[]) {
int i, k;
i = 10;
k = i < 0 ? -i : i; // get absolute value of i 10<0
System.out.print("Absolute value of ");
System.out.println(i + " is " + k);
i = -10;

k = i < 0 ? -i : i; // get absolute value of i
// k=-10<0? - (-10): -10

if(i<0)
	k= -(i);
else
	k=i;


System.out.print("Absolute value of ");
System.out.println(i + " is " + k);
}
}

