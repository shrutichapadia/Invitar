package fundamental;

import java.util.*;

public class lab2702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String pattern;
//		int x; int a = 0;
//		 System.out.println("Enter Elements size:");
//		 Scanner obj = new Scanner(System.in);
//		 int xz = obj.nextInt();
//		 int[] myarr=new int[xz];
//		 Scanner ab;
//
//		 for(int i=0;i<xz;i++){
//			 System.out.println("Enter number in array:");
//			 ab = new Scanner(System.in);
//			 int num = ab.nextInt();
//			 myarr[i]=num;
//			 
//		 }
//		 for(int i=0;i<xz;i++){
//			 System.out.println(myarr[i]);
//		 }
//		
//		while( a < xz){
//			 System.out.println("Enter number in array:");
//			 ab = new Scanner(System.in);
//			 int num = ab.nextInt();
//		
//			 System.out.println("Arraylist is==================:"+myarr[num]);
//		 }
		 
//		Scanner a = new Scanner(System.in);
//		 String[] num = new String[xz];
//		 System.out.println("Arraylist is:::::::::::::::::::::"+num);
//		
		ArrayList al = new ArrayList();
		al.add("abcd");
		al.add("xyz");
		
		System.out.println("Arraylist is:"+al);
		al.remove("xyz");
		System.out.println("Arraylist is:"+al);
		
		int[] alm  = {1,2,3,5};
		for(int i=0; i<alm.length; i++ ){
		System.out.println("Arraylist is:" +alm[i]);
	}
		 
		//	obj.close();
	}
	
}
