// Demonstrate an inner class.
class Outer {
int outer_x = 100;
void test() {
Inner inner = new Inner();
inner.display();
}
// this is an inner class

class Inner {
void display() {
	int inner_x=200;
System.out.println("display: outer_x = " + outer_x);
System.out.println(inner_x);
}

}

//System.out.println(inner_x);

}
class InnerClassDemo {
public static void main(String args[]) {
Outer outer = new Outer();
outer.test();
}
}

