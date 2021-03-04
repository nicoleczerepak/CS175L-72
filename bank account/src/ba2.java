import java.util.Scanner;
public class ba2 {
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			//
			//System.out.println("Enter the starting balance of your bank account: "); //del
			System.out.println("Enter an amount to start the account: ");
			double startBalanc = in.nextDouble();
			
			System.out.println("Enter the interest rate for the account: ");
	 		double interestPct = in.nextDouble();
	 		
	 		ba myBankAccount = new ba(startBalanc, interestPct);
			
			//ba BankAccount = new ba(in.nextDouble()); //del
			
			System.out.println("Enter the amount you would like to withdraw?: "); //del
			//BankAccount.withdraw(in.nextDouble());   //del
			System.out.println("Enter an amount to withdraw from the account: ");
			double withdrawAmount = in.nextDouble();
			myBankAccount.withdraw(withdrawAmount);
			
			//System.out.println("Enter the amount you would like to deposit: "); //del
			System.out.println("Enter amount to deposit in the account: ");
			double depositAmount = in.nextDouble();
			myBankAccount.deposit(depositAmount);
			
			BankAccount.deposit(in.nextDouble());//del
			
			//System.out.println("The balance of your account is $" + BankAccount.getBalance()); //del
			
			System.out.println(" If you want me to generate interest, enter 'Yes': ");
			String ansr = in.next();
			if (ansr.equals("Yes")) {
				myBankAccount.calcInterest();
			}
			
			System.out.println ("Your balance is: " + myBankAccount.getBalance());
	}
}
