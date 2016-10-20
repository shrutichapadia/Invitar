package com.npu.cs501;


import java.util.LinkedList;

public class RemoveDuplicate {

public static <E> LinkedList<E> RemoveDuplicate(LinkedList<E> Listfinal){
		    
			 LinkedList<E> mylist = new LinkedList<E>();
			   
			   
			   for(int i=0; i < Listfinal.size(); i++)
			   {
			     E object = Listfinal.get(i);
			     
			     if(!mylist.contains(object)){
			         
			         mylist.add(object);
			        
			     }
			   }
			    
			    return mylist; 
			    }

			//
			//String s = list.get(0); // No casting is needed
			    
			    public static void main(String[]args){
			   LinkedList<Integer> list = new LinkedList<Integer>();
			     
			    
			  list.add(11);
			   list.add(11);
			   list.add(11);
			    list.add(21);
			    list.add(43);
			   list.add(43);
			  list.add(61);
			    
			    System.out.println("Original MyList :::::::"  + list);
			    
			    
			     System.out.println();
			    list = RemoveDuplicate(list);
			    
			     System.out.println("After Removing duplicate from MyList::::::"  +list);
			     
			    Integer s = list.get(2);
			      System.out.println(s);
			   list.equals(list);
			      System.out.println();
		
		
	}

}
