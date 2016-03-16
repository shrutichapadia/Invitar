package fundamental;

public class vehicle {
	
	interface make{
	
		void print();
	}
}
	 class BMW extends vehicle implements Make {
		public void print(){
			System.out.println("BMW class implements vehicle");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW obj = new BMW();
		obj.print();

	}


	
	}


