/*
 When one type of data is assigned to another type of variable, an automatic type
conversion will take place if
The two types are compatible.
The destination type is larger than the source type.
When these two conditions are met, a widening conversion takes place. 

L to D is fine but not vice versa
char to boolean, or int to boolean ==> illegal
 */



public class TypeConversion13 {
	public static void main(String args[]) {
		long L;
		double D;
		L = 100123285L;
		D = L;
		System.out.println("L and D: " + L + " " + D);
		D = 100123285.0;
		//L = D; // Illegal!!!
		System.out.println("L and D: " + L + " " + D);
		}

		}


