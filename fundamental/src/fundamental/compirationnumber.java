package fundamental;

public class compirationnumber {
	int count =0;
	int []a;           
	int i;
	int max,min;
	public int max(int a[]){
		int count =0;
		max = a[0];
		for(i=0; i<= a.length-1;i++){
			
		if(a[i] > max){
			max = a[i];
			count++;
		//	System.out.println(" max number in array is:" +max);
			}
		 }
		System.out.println("Occurance of max number in array is" + count);
		return max;	
		
	}
	public int min(int a[]){
		int count=1;
		
		min = a[0];
	
		for(i=0; i<= a.length-1;i++){
			
			if(a[i] < min){
				min = a[i];
				count++;
			
				}
		
			 }
			System.out.println("Occurance of min number in array is"+ count);
			return min;	
		
	}

public static void main (String []args){
	int x,y,a,b; 
	
	int [] mylist1 = {3,5,0,5,5,5,0};
	int [] mylist2 = {3,0,4,2,4,5,4,5,5,1};
	
	compirationnumber obj = new compirationnumber();
	x= obj.max(mylist1);
	y = obj.min(mylist1);	
	System.out.println("maximum number in array is "+x);
	
	System.out.println("mimimum number in array is "+y);
	
	a= obj.max(mylist2);
	b = obj.min(mylist2);	
	System.out.println("maximum number in array is "+a);
	System.out.println("mimimum number in array is "+b);
	
}



}

 