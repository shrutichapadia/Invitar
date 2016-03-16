
class LogicalOpTable {
public static void main(String args[]) {
boolean p, q;
System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
p = true; q = true;
System.out.print(p + "\t" + q +"\t");
System.out.print((p&q) + "\t" + (p|q) + "\t"); //2*(3-4)+1
System.out.println((p^q) + "\t" + (!p));

p = true; q = false;
System.out.print(p + "\t" + q +"\t");
System.out.print((p&q) + "\t" + (p|q) + "\t");
System.out.println((p^q) + "\t" + (!p));

p = false; q = true;
System.out.print(p + "\t" + q +"\t");
System.out.print((p&q) + "\t" + (p|q) + "\t");
System.out.println((p^q) + "\t" + (!p));

p = false; q = false;
System.out.print(p + "\t" + q +"\t");
System.out.print((p&q) + "\t" + (p|q) + "\t");
System.out.println((p^q) + "\t" + (!p));
}
}

//See the Hidden Notes







/*Notice the parentheses surrounding the logical operations inside the println( ) statements.
They are necessary because of the precedence of Java’s operators. The + operator is higher
than the logical operators.*/
