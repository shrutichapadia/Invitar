
// Method overriding.
class A3 {
int i, j;
A3(int a, int b) {
i = a;
j = b;
}

void show() {
System.out.println("i and j: " + i + " " + j);
}
}
class B3 extends A3 {
int k;
B3(int a, int b, int c) {
super(a, b);
k = c;
}

void show() {
super.show();
System.out.println("k: " + k + "  i=" + i + "  j=" + j);
}

}
class OverrideDemo {
public static void main(String args[]) {
B3 subOb = new B3(1, 2, 3);
subOb.show(); 
}
}

