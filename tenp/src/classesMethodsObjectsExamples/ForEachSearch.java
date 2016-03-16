package classesMethodsObjectsExamples;
//Search the element in the array
class ForEachSearch {
	public static void main(String args[])throws java.io.IOException {
		int val =0;
		int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		
		boolean found = false;
		// Use for-each style for to search nums for val.
		for(int x : nums) {
		if(x == val) {
		found = true;
		break;
		}
		}
		
		if(found)
		System.out.println("Value found!" + found);
		
		System.out.println("Value found!" +found );
		
		}
	
	

}
