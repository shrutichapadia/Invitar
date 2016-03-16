package classesMethodsObjectsExamples;
class Test10{
void meth(int i, int j) {
	//val of a gets copied to i and val of b get copies to j
	
i *= 2;
j /= 2;
System.out.println("i and j after call: " +i + " " + j);

}
}
class CBV {
public static void main(String args[]) {
Test10 ob = new Test10();
int a = 15, b = 20;
System.out.println("a and b before call: " + a + " " + b);//
 ob.meth(a, b);
 System.out.println("a and b after call: " +a + " " + b);
}
}
