package fundamental;

public class NewEvenPlace {
	
	
	public int sumOfOddPlace(int[] myaar) {
		int []myarray = {1,5,5,7,4};
        int result = 0;
        for (int i=0; i< myarray.length; i++)
        {
        while (myarray[i] >=0) {
            result += (int) (myarray[i] % 10);
            myarray[i] = myarray[i] / 100;
         }
        }
         System.out.println("\n The sum of odd place is " + result);
        return result;
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []myaar = {1,5,5,7,4};
		NewEvenPlace  obj = new NewEvenPlace ();
			int x = obj.sumOfOddPlace(myaar);
		System.out.println("hello" +x);
	}

}
