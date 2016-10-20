package fundamental;

import java.util.Scanner;

public class moreeffective {
	
	public static double average(double[] array) {
        double total = 0;
        double avg = 0;
            for(int i =0; i < 11; i++) {
                total += array[i];
                avg = total / array.length;
            }
        return avg;

    }

	public static int average (int[] array)
    {
        int sum = 0; int average2 = 0;
     //   double [6]array1;
      
        for (int x = 0; x < 11; ++x){
            sum+=array[x];
            average2 = sum/array.length;
           
        }
		return average2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enter=0;

		Scanner input = new Scanner(System.in);
		
		
		if (enter == 1) {                                  
            double[] array1 = new double[11];
                for(int i = 0; i < 10; i++){
                   
                    array1[i] = input.nextDouble();
                }
                double x = average(array1);
                System.out.println("The average of your arrays numbers is: " + x);
                String numasString = Double.toString(x);
                System.out.println("average number in Converted String number " +numasString);

        } else if (enter == 0) {                           
            int[] array2 = new int[11];
            System.out.println("Enter a number to average.");
                for(int b = 0; b < 10; b++) {
                    
                    array2[b] = input.nextInt();
                }
                int z = average(array2);
                
                System.out.println("The average of your arrays numbers is: " + z);
                String numberasString = Integer.toString(z);
                System.out.println("average number in Converted String number " +numberasString);
                
        }
		input.close();	
}
}



//Write two overloaded methods that return the average of an array with the following headers: 
//public static int average(int[] array) 
//public static double average(double[] array) 
//Write another overloaded method to covert the average value to String and replace 1 with ‘One’, 2 with ‘Two’ on the String.
//Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value and covert String. 
