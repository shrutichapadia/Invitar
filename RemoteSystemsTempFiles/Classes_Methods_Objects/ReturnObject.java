
// Returning an object.
class Test3 {
int a;

Test3(int i) {
a = i;
}
Test3 incrByTen() {
Test3 temp = new Test3(a+10); // temp =Test3(12)
return temp;
}
}
class ReturnObject {
public static void main(String args[]) {
Test3 ob1 = new Test3(2); // calling const a=2
//ob1.incrByTen();
//Test3 ob2; 
Test3 ob2 = ob1.incrByTen();    //int range=vehicle.getRange();
System.out.println("ob1.a: " + ob1.a);
System.out.println("ob2.a: " + ob2.a);
ob2 = ob2.incrByTen();
System.out.println("ob2.a after second increase: "+ ob2.a);
}
}
