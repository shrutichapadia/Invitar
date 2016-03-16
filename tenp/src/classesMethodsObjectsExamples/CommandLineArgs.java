package classesMethodsObjectsExamples;
// Display all command-line information.
class CommandLineArgs {
public static void main(String args[]) {
System.out.println("There are " + args.length + " command-line arguments.");
System.out.println("They are: ");
String args1[]={"one", "two"};
args[2]="Four";
args[4]="two";
args=args1;

for(int i=0; i<args.length; i++)
System.out.println("arg[" + i + "]: " + args[i]);
}


}
