package classesMethodsObjectsExamples;
class VehicleWithCons {
int passengers; // number of passengers
int fuelcap; // fuel capacity in gallons
int mpg; // fuel consumption in miles per gallon
// This is a constructor for Vehicle.
VehicleWithCons(){
	
}


VehicleWithCons(int p, int f, int m) {
passengers = p;
fuelcap = f;
mpg = m;
}
// Return the range.
int range() {
return mpg * fuelcap;
}
// Compute fuel needed for a given distance.
double fuelneeded(int miles) {
return (double) miles / mpg;
}
}
class VehConstDemo {
public static void main(String args[]) {
// construct complete vehicles
	VehicleWithCons minivan = new VehicleWithCons(7, 16,21);
	//minivan.fuelcap=10;
	
	
	VehicleWithCons sportscar = new VehicleWithCons(2, 14, 12);
double gallons;
int dist = 252;
gallons = minivan.fuelneeded(dist);
System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
gallons = sportscar.fuelneeded(dist);
System.out.println("To go " + dist + " miles sportscar needs " +gallons + " gallons of fuel.");
}
}
