
// A Simple demonstration of abstract.
 abstract class A5 {
abstract void callme();
// concrete methods are still allowed in abstract classes
void callmetoo() {
System.out.println("This is a concrete method.");
}
}
class B5 extends A5 {
void callme() {
System.out.println("B's implementation of callme.");
}
}
class AbstractDemo {
public static void main(String args[]) {
	
//A5 a =new A5();
//a.callme();
	
B5 b = new B5();
b.callme();
b.callmetoo();
}
}

//Notice that no objects of class A5 are declared in the program. it is not possible to instantiate an abstract class.