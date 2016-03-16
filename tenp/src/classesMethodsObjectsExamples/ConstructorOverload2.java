package classesMethodsObjectsExamples;
// Here, Box allows one object to initialize another.
class Box2 {
double width;
double height;
double depth;
// Notice this constructor. It takes an object of type Box.
Box2(Box2 ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
Box2(double w, double h, double d) {
width = w*2;
height = h;
depth = d;
}

// compute and return volume
double volume() {
return width * height * depth;
}
}
class ConstructorOverload2 {
public static void main(String args[]) {
// create boxes using the various constructors
Box2 mybox1 = new Box2(10, 20, 15); // object created with given dimensions.
Box2 myclone = new Box2(mybox1); // create copy of mybox1
double vol;
// get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);
// get volume of clone
vol = myclone.volume();
System.out.println("Volume of clone is " + vol);
}
}
