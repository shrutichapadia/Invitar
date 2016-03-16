class NoBreak{
		public static void main(String args[]) {
			int i;
			for(i=0; i<=2; i++) {
				switch(i) { //switch(0), switch(1), swithc(2)
				case 0:
					System.out.println("i is less than one");
				case 1:
					System.out.println("i is less than two");
				case 2:
					System.out.println("i is less than three");
					}
				System.out.println();
			}
		}
}

