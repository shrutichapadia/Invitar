
// Using abstract methods and classes.
abstract class Figure1 {
double dim1;
double dim2;
Figure1(double a, double b) {
dim1 = a;
dim2 = b;
}
// area is now an abstract method
abstract double area();

double perimeter(){
	
	return (2*(dim1+dim2));
}
}
class Rectangle1 extends Figure1 {
Rectangle1(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {
System.out.println("Inside Area for Rectangle1.");
return dim1 * dim2;
}
}
class Triangle1 extends Figure1 {
Triangle1(double a, double b) {
super(a, b);
}
// override area for right triangle
double area() {
System.out.println("Inside Area for Triangle1.");
return dim1 * dim2 / 2;

}

}

