package com.npu.cs501;

public class InsertionSort {

	public static void InsertionSort(int [] list)
	{
		for(int i = 1; i<list.length; i++){
			int element = list[i];
			int k;
			for(k=i-1; k>=0 && list[k] > element; k--){
				
				list[k+1]= list[k];
				
			}
			list[k+1] = element;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] data ={4,9,15,1,8};
		
		System.out.println("Data before performed Insertion Sort   " +data);
		
		InsertionSort.InsertionSort(data);
		
		System.out.println("Data after performed InsertionSort    "+data);
	}

}
