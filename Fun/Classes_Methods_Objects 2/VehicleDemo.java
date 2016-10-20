// This class declares an object of type Vehicle.

class VehicleDemo{
	public static void main(String args[]) {
		Vehicle1234 minivan = new Vehicle1234();
		int range;
		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		// compute the range assuming a full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
}
}