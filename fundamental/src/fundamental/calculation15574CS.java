package fundamental;

//import java.util.Scanner;

public class calculation15574CS {
	
	int a,b,c;
	public static int addition(int a, int b){
		int sum = a+b;
		return sum;
	}
	public int substraction(int a, int b, int c){
		int sub = a-b-c;
		return sub;
	}
	public int multi(int a, int b, int c){
		int multi = a*b*c;
		return multi;
	}
	public int divison(int a, int b){
		int div = a/b;
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int x=10;
	int y=15;
	int z=20;
	calculation15574CS num = new calculation15574CS();
	int num1 = calculation15574CS.addition(x,y);
	int num2 = num.substraction(x,y,z);
	int num3 = num.multi(x,y, z);
	int num4 = num.divison(z , x);
	
//	Scanner input = new Scanner(System.in);
//	int num11 = input.nextInt();
//	
//	int number = addition(num11,num11);
//	System.out.println("Addition of  number is:" + number);
//	input.close();
	System.out.println("Addition of  number is:" +num1);
	System.out.println("Substraction of  number is:" +num2);
	System.out.println("Multiplication of  number is:" +num3);
	System.out.println("Division of  number is:" +num4);
	}
	
}
