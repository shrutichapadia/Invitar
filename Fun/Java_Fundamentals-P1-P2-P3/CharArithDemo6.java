
public  class CharArithDemo6{
		public static void main(String args[]) {
		char ch;
		ch = 'A'; //ASCII =65
		System.out.println("ch contains " + ch );
		ch=234;
		//ch++; // ch=ch+1 increment ch
		System.out.println("ch is now " + ch);
		ch = 90; // give ch the value Z
		System.out.println("ch is now " + ch);
		}
	}
/*
Q: Why does Java use Unicode?
A: Java was designed for worldwide use. Thus, it needs to use a character set that can
represent all the world’s languages. Unicode is the standard character set designed
expressly for this purpose. Of course, the use of Unicode is inefficient for languages
such as English, German, Spanish, or French, whose characters can be contained
within 8 bits. But such is the price that must be paid for global portability.
*/