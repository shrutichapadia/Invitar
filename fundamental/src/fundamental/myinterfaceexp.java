package fundamental;

interface interfaceexp {
	public void method1();
	public void method2();
}

public class myinterfaceexp implements interfaceexp{
		
	public void method1(){
		System.out.println("implementation of method 1");
	}
	public void method2(){
		System.out.println("implementation of method 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myinterfaceexp obj = new myinterfaceexp();
		obj.method1();
		obj.method2();
		
	}	
	

}
