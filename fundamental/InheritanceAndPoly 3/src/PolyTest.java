
class Shape{ //make this abstract
  protected final static double PI = 22.0/7.0;
  protected double length;
  public double area() //make this abstract
  {
	  return 0;
  }
}

class Square extends Shape{
  Square(double side){
	length=side;// initializes inherited length
  }
  public double area(){// overrides area() of Shape
	return length*length;// length inherited from Shape
  }
}

class Circle extends Shape{
  Circle(double radius){
	length=radius;// initializes inherited length
  }
  public double area(){// overrides area() of Shape
	return PI*length*length;// PI & length inherited from Shape
  }
}


/**
 * Polymorphism & Dynamic binding test class
 **/
public class PolyTest{
  public static void main(String[] args){
	Shape sh;// no object instance just variable declaration
	Square sq = new Square(10.0);// sq is a Square object reference 
	Circle circ = new Circle(10.0);// circ is a Circle object reference

	sh=sq;// sh dynamically bound to the Square object referenced by sq
	System.out.println("Area of Square = " + sh.area());

	sh=circ; // sh dynamically bound to the Circle object referenced by circ
	System.out.println("Area of circle = " + sh.area());
  }
}