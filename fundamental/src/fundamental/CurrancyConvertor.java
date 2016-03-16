package fundamental;



public class CurrancyConvertor {
	
	String Currancy;
	static double dol = 1;
	static double rmb = 1;
	static double rate= 6.81;
	public static double convertintodollar(){
		return dol = (dol*rate);
	}
	
	public static double convertintoRMB(){
		return rmb = (dol/rate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num1;
		
		//Scanner input = new Scanner(System.in);
		//num1 = input.nextInt();
		System.out.println(" 0 to convert from USD to RMB and 1 for USD to RMB");
		
		
		//Scanner input1 = new Scanner(System.in);
		System.out.println(" Please Enter USD to conver it to RMB");
		//dol = input1.nextDouble();
		//Scanner sca = new Scanner(System.in);
		System.out.println(" Please Enter RMB to conver it to USD");
		//rmb = sca.nextDouble();
	
//		switch(num1){
//		
//		case 0:
//				if(num1 == 0){
//					
//			System.out.println("USD to RMB converted Currancy is:"+ convertintodollar());
//				}
//				break;
//		case 1:
//			if(num1 == 1){
//			
//			System.out.println("RMB to USD converted Currancy is:"+ convertintoRMB());
//			}
//			break;
//		default: 
//			System.out.println("Same currancy not convert");
//		
		
	//	}
	}

	

}
