package com.npu.cs501;


import java.util.*;

public class RevNameLinkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Object> mylist = new LinkedList<>();
		
		mylist.add(0,"s");
		mylist.add(1,"h");
		mylist.add(2,"r");
		mylist.add(3,"u");
		mylist.add(4,"t");
		mylist.add(5,"i");
		
		System.out.println(mylist);
		//((LinkedList<Object>) mylist).removeLast();
		//System.out.println(mylist);
		// print list forward		
		ListIterator<Object> listIterator =	mylist.listIterator();
//		
//		while(listIterator.hasNext()){
//			System.out.println(listIterator.next() +" ");
//		}
		System.out.println();
		listIterator = mylist.listIterator(mylist.size());
		while(listIterator.hasPrevious()){
			
			System.out.println(listIterator.previous() +" ");
		}
	}
}

