
//find factors of numbers between 2 and 20.
class FindFac {
	public static void main(String args[]) {
		for(int i=2; i <= 20; i++) {
			System.out.print("Factors of " + i + ": ");
				for(int j = 2; j < i; j++){  //i=4, j=3 ; 
					if((i%j) == 0) System.out.print(j + " ");
				}
					System.out.println();
				}
			}
}

