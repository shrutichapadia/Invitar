package fundamental;

public class iphone {
	
	public int year;
	public String name;
	public String type;
	
		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
	
//		String	getphoneinfo(){
//			String n = this.getName();
//		return getphoneinfo();
//			
//		}

		public class ipad extends iphone{
			
		String	gettype(String type){
			
			this.type = type;
			
			return type;
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iphone input = new iphone();
		input.setName("iphone6S");
		input.setType("iphone6");
		input.setYear(2015);
		System.out.println("Latest  iphone is " +input.getName() +"     which is type of    " + input.getType()+ "    released in market since     " + input.getYear());
		
		
		
		
	}

	

	

}
