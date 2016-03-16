
public class DynamicInit9 {
	public static void main(String args[]) {
		double radius = 4, height = 5;
		// dynamically initialize volume
		double volume = 3.1416 * radius * radius * height;
		System.out.println("Volume is " + volume);
		}
}
/*
The key point here is that the initialization expression can use any
element valid at the time of the initialization, including calls to methods, other variables,
or literals.
volume is dynamically initialized at run time.
*/