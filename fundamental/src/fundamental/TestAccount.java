package fundamental;
import java.util.Date;
import java.lang.*;


public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Account acc = new Account(1122,20000);
	System.out.println("Initial Information for Account "+"ID:"+acc.getid()+" and Its  Balance is:   "+ acc.getBalance());
	
	acc.setAnnualInterstRate(4.5);
	System.out.println("Monthly interest is "+ acc.getMonthlyInterestRate(0));
	acc.getWithdraw(2500);
	acc.getDeposit(3000);
	System.out.println("Person Account id and balance are after Deposit "+ acc.getBalance());
	Date date = new Date();
	date.toString();
	System.out.println("This was created on this date:" +date.toString() );
}
}