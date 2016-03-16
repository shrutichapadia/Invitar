package fundamental;

public class Testlab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		String firstname = "shruti";
		String lastname = "Chapadia";
		String address = "NPU University";
		String stdid = "15574cs";
		String desi = "Professior";
	person name1 = new person();
	Student ids = new Student();
	Employee des = new Employee();
		 name = name1.getFname();
		System.out.println("Firstname is:"+firstname);
		 name = name1.getLname();
		System.out.println("Lastname is:"+lastname);
		 name = name1.getAddress();
		System.out.println("Address is:"+address);
		name = des.getDesignation();
		System.out.println("Designation is :"+desi);
		name = ids.getId();
		System.out.println("My Student ID is:"+stdid);
		System.out.println("My Student ID is:"+name);
	}

}
