package fundamental;


//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class validatePassword {
 
private static Pattern pswPtrn =
        Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{5,15})");
     
    public static boolean validatePassw(String passwd){
         
        Matcher mtch = pswPtrn.matcher(passwd);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String args[]){
    	
   
//    Scanner inp = new Scanner(System.in);
//   String str1;
//   str1 = inp.next();
//    
//    System.out.println("is check a valid" + validatePassw.str1);
        System.out.println("Is 'check' a valid password? "
                            +validatePassw("check"));
        System.out.println("Is 'cheCK01' a valid password? "
                            +validatePassw("cheCK01"));
        System.out.println("Is 'Check67' a valid password? "
                            +validatePassw("Check67"));
        System.out.println("Is 'Chck' a valid password? "
                            +validatePassw("Chck"));
   
    }
}
