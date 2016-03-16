package fundamental;



public class Currancy{
	
		
		String Currancy;
		static double dol = 10000;
		static double rmb = 1;
		static double rate= 6.81;
		
		public static double convertintodollar(){
			return dol = (dol*rate);
		}
		
		public static double convertintoRMB(){
			return rmb = (dol/rate)*100;
		}

	
	public static void main(String args[]){
		int num1 = 0;
		//double dollar = 1000;
		//double rmb;
		switch(num1){
		
		case 0:
				if(num1 == 0){
					
			System.out.println("USD to RMB converted Currancy is:"+convertintoRMB());
				}
				break;
		case 1:
			if(num1 == 1){
			
			System.out.println("RMB to USD converted Currancy is:" +convertintodollar());
			}
			break;
		default: 
			System.out.println("Same currancy not convert");
		
		
		}
	}
}
