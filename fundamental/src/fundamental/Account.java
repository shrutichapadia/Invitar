package fundamental;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance =0;
	private double AnnualInterstRate =0;
	private Date dateCreated;
	
	public Account(int id, double bal){
		this.balance = bal;
		this.id = id;
	}
	public int getid(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterstRate() {
		return AnnualInterstRate;
	}
	public void setAnnualInterstRate(double AnnualInterstRate) {
		this.AnnualInterstRate = AnnualInterstRate;
	}
	public Date getDateCreated(Date dateCreated) {
		return dateCreated;
	}
	public double getMonthlyInterestRate(double MonthlyInterestRate){
		return MonthlyInterestRate = AnnualInterstRate/12;
	}
	
	public double getWithdraw(double Withdraw){	
		return balance= balance - Withdraw;
	}
	public double getDeposit(double deposit){
		return balance = balance + deposit;
	}
	
	
}
