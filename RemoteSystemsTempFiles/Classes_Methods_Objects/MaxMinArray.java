
// Find the minimum and maximum values in an array.
class MaxMinArray {
public static void main(String args[]) {

	int nums[] = new int[10];
	//int[] nums=new int[5];

int min, max;
 nums[0] = 99;
nums[1] = -10;
nums[2] = 100123;
nums[3] = 18;
nums[4] = -978;
nums[5] = 5623;
nums[6] = 463;
nums[7] = -9;
nums[8] = 287;
nums[9] = 49;


//int nums[] = { 99, -10, 100123, 18, -978,5623, 463, -9, 287, 49 };


min = max = nums[0];//min and max=99
for(int i=1; i < nums.length; i++) { //1 to 9
	
if(nums[i] < min) min = nums[i]; // -10<99 min=-10

//-10 < 99 => min =-10 i=1
//100123 < -10, min=-10

if(nums[i] > max) max = nums[i]; //-10>99 max=99
}
System.out.println("min and max: " + min + " and " + max);
}
}



