package classesMethodsObjectsExamples;
public class ReverseLine {
	        public static void main(String[] args) {

//------------------------------------------------------------

                String input =  "life is cool";

                System.out.println("The original sentence is : " + input );
            System.out.print("The reverse would be : ");

        for ( int i = input.length() - 1 ; i >= 0 ; i-- ){
                System.out.print(input.charAt(i));
        }

      //------------------------------

        System.out.println(" ");
        System.out.print("Or if you want  : ");

        String[] individualWords = input.split ( " " );

        for(int x = individualWords.length - 1; x >= 0 ; x--){
                System.out.print(individualWords[x] + " ");
            }
//------------------------------------------------------------
        System.out.println(" ");
}
}