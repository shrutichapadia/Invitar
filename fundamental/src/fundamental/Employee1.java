package fundamental;

public class Employee1 {

	int employeeId;
	String employeeName;
	String Address;
	public Employee1(int id,String name,String add){
		
		this.employeeId = id;
		this.employeeName = name;
		this.Address = add;
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
 	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return Address;
	}
	
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", Address=" + Address + "]";
	}

	public void setAddress(String address) {
		Address = address;
	}
	public void displayemp(){
		
		System.out.println("Employee detail are:::: ID: " + getEmployeeId() + " Name is:" + getEmployeeName()+ "Address is:" +getAddress());
		
	}
	
}
