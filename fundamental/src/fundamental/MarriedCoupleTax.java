package fundamental;



public class MarriedCoupleTax {

	 //int inc=0;
	 double tax=0;
	 //double  tax1 = 0,tax2=0, tax3=0,tax4=0;
 public double MarriedTaxcalculation(double inc ){
	
		if(inc>=0 && inc<=16700){
			double  temp = (inc* 0.1);
		 tax = tax + temp;
		}
		 if(inc>=16701)
		 {
			if(inc<=67900){
			double temp1 =((inc-16700) * 0.15);
			tax = 1670 + temp1;
			}
	}
		if(inc>=67901)
		{
			if(inc<= 137050){
				double temp2 =((inc - 67900) * 0.25);
			 tax = 9350+ temp2;
		}
		}
	 if(inc>=137051)
		{
			if(inc<= 208850){
				double temp3 =((inc-137050) * 0.28);
			 tax = 9350+17287.50+temp3;
			}
		}
	 if(inc>=208851)
		{
			if(inc<= 372950){
				double temp3 =((inc-208850) * 0.33);
			 tax = 46741.50+ temp3;			
			}
		}
	 if(inc>=372951)
		{
				double temp3 =((inc-372950) * 0.35);
			 tax = 100894.50+temp3;			
			
		}
	 System.out.println("tax for Married Couple  ======" +tax);
		return 0;	
	}


 
	
}
