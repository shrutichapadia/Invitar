package fundamental;

public class InheritanceShape {
	

	
		int height;
		int weidth;
		
		int getarea(){
			
			return height*weidth;
		}

public class circle extends InheritanceShape{
	
	
	int getperi(){ 
		int getperi = 2*(height+weidth);
		return getperi;
	
		}

}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int height = 5;
	//	int weight =6;
		InheritanceShape c1 = new InheritanceShape();
		
		System.out.println("radius of the  circle is:"+ c1);

	}



	
}
