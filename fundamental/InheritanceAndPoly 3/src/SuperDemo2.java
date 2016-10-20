
// Using super to overcome name hiding.
class A1  {
int i;
}
// Create a subclass by extending class A1.
class B1 extends A1 {
int i; // this i hides the i in A1
B1(int a, int b) {
super.i = a; // i in A1
i = b; // i in B
}
void show() {
System.out.println("i in superclass: " + super.i);
System.out.println("i in subclass: " + i);
}
}
class SuperDemo2 {
public static void main(String args[]) {
B1 subOb = new B1(1, 2);
subOb.show();
}
}

/* Although the instance variable i in B hides the i in A, super allows access to the i defined
in the superclass. As you will see, super can also be used to call methods that are hidden by a
subclass.
*/