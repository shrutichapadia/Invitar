package fundamental;

//public class intest {
//	
//	//Returning an Array from a Method:
//	//	A method may also return an array. For example, the method shown below returns an array that is the reversal of another array:
//
//		public static int[] reverse(int[] list) {
//		  int[] result = new int[list.length];
//
//		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//		    result[j] = list[i];
//		  }
//		  return result;
//		}
//}

//public static void sort(Object[] a)
//Sorts the specified array of objects into ascending order, according to the natural ordering of its elements. Same method could be used by all other primitive data types ( Byte, short, Int, etc.)

//Getting Current Date & Time
//This is very easy to get current date and time in Java. You can use a simple Date object with toString() method to print current date and time as follows:
//
//import java.util.Date;
//  
//public class DateDemo {
//   public static void main(String args[]) {
//       // Instantiate a Date object
//       Date date = new Date();
//        
//       // display time and date using toString()
//       System.out.println(date.toString());
//   }
//}

//The appendReplacement and appendTail Methods:
//The Matcher class also provides appendReplacement and appendTail methods for text replacement.
//
//Here is the example explaining the functionality:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class intest
{
   private static String REGEX = "a*b";
   private static String INPUT = "aabfooaabfooabfoob";
   private static String REPLACE = "-";
   public static void main(String[] args) {
      Pattern p = Pattern.compile(REGEX);
      // get a matcher object
      Matcher m = p.matcher(INPUT);
      StringBuffer sb = new StringBuffer();
      while(m.find()){
         m.appendReplacement(sb,REPLACE);
      }
      m.appendTail(sb);
      System.out.println(sb.toString());
   }
}

//public class SearchStringEmp{
//	   public static void main(String[] args) {
//	      String strOrig = "Hello readers";
//	      int intIndex = strOrig.indexOf("Hello");
//	      if(intIndex == - 1){
//	         System.out.println("Hello not found");
//	      }else{
//	         System.out.println("Found Hello at index "
//	         + intIndex);
//	      }
//	   }
//	}