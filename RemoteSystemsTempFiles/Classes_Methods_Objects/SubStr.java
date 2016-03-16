
class SubStr {
public static void main(String args[]) {
String orgstr = "Java makes the Web move.";
// construct a substring
String substr = orgstr.substring(5, 18); //new string 
System.out.println("orgstr: " + orgstr);
System.out.println("substr: " + substr);
System.out.println("orgstr: " + orgstr);
}
}

// "some" => some0 , some01, some012, someo123....some01234567..99....
// "some" => some0123
// javac , java SubStr one two