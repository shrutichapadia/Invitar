
// Demonstrate String arrays.
class StringsArray {
public static void main(String args[]) {
	String strs[] = { "This", "is", "a", "test." }; // strs[0]=this, strs[1]=is 
	//int nums[]={1,2,3,4}; munms[0]=1, nums[1]=2...
	System.out.println("Original array: ");
	
	for(int k=0;k<strs.length;k++)
		System.out.print( strs[k] + " ");
	
	for(String s : strs)
	System.out.print(s + " ");
	System.out.println("\n");
	// change a string
	strs[1] = "was";
	strs[3] = "test, too!";
	System.out.println("Modified array: ");
	for(String s : strs)
	System.out.print(s + " ");
	}
}

