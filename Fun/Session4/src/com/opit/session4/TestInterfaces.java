package com.opit.session4;

public class TestInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		System.out.println(d.num_of_legs);
		
	    Horse h = new Horse();
	    System.out.println(h.num_of_legs);
	    System.out.println(h.num_of_tails);
	    h.eat(); 
        h.breathe();
        h.sleep();
        
        d.breathe();
        
        //Polymorphism LHS and RHS rule applies
        Animal a = new Horse();
        a.eat(); // RULE2 : At run time, the actual object decide which method will execute
	    
	}

}
