package fundamental;

import java.util.Scanner;


public class TaxCalculation {
	 //int inc=0;
	 double tax=0;
	 //double  tax1 = 0,tax2=0, tax3=0,tax4=0;
 public double Singlecalculation(double inc ){
	
		if(inc>=0 && inc<=8350){
			double  temp = (inc* 0.1);
		 tax = tax + temp;
		}
		 if(inc>=8351){
			if(inc<=33950){
			double temp1 =((inc-8350) * 0.15);
			tax = 835 + temp1;
			}
	}
		if(inc>=33951)
		{
			if(inc<= 82250){
				double temp2 =((82250-inc) * 0.25);
			 tax = 835+3840+ temp2;
		}
		}
	 if(inc>=82251)
		{
			if(inc<= 171550){
				double temp3 =((inc-82250) * 0.28);
			 tax = 835+3840+ 12075+temp3;
			}
		}
	 if(inc>=171551)
		{
			if(inc<= 372950){
				double temp3 =((inc-171550) * 0.33);
			 tax = 835+3840+ 12075+29469+temp3;			
			}
		}
	 if(inc>=372951)
		{
				double temp3 =((inc-171550) * 0.35);
			 tax = 835+3840+ 12075+29469+66462+temp3;			
			
		}
	 System.out.println("tax for Single person ======" +tax);
		return 0;	
	}

 


 public static void main(String args[]) throws java.io.IOException {
		 
		double income;
		int choice;
		 Scanner in = new Scanner(System.in);	
		System.out.println("Enter your income");		
	      income = in.nextInt();
	      System.out.println("Your income is: " + income);
	     
	      do {
	    	  System.out.println("Select Tax return options:");
	    	  System.out.println(" 0. Single");
	    	  System.out.println(" 1. Married Couple");
	    	  System.out.println(" 2. Married but Filling Seperately");
	    	  System.out.println(" 3. Head of HouseHold");
	      
	    	  do {
	    		  choice = (int) System.in.read();
	    		  } while(choice == '\n' | choice == '\r');
	    		  } while( choice < '0' | choice > '4' & choice != 'q');
	      			if(choice == 'q');
	      			System.out.println("\n");
	    		  switch(choice) {
	    		  case '0':
		    		  TaxCalculation obj = new TaxCalculation();
		    			//double sig = 0;// 
		    			 obj.Singlecalculation(income);
		    		  break;
	    		  case '1':
	    			  MarriedCoupleTax m = new MarriedCoupleTax();
	    			//double sig = 0;// 
	    			 m.MarriedTaxcalculation(income);
	    		  break;
		
	    		  }
		
		//System.out.println("Tax calculation for single :"+sig);
	    	in.close();	  
	}
	
 }
 



