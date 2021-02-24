import java.util.Scanner;
public class ba2 {
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			//
			System.out.println("Enter the starting balance of your bank account: ");
			
			ba BankAccount = new ba(in.nextDouble());
			
			System.out.println("Enter the amount you would like to withdraw?: ");
			
			BankAccount.withdraw(in.nextDouble());
			
			System.out.println("Enter the amount you would like to deposit: ");
			
			BankAccount.deposit(in.nextDouble());
			
			System.out.println("The balance of your account is $" + BankAccount.getBalance());
	}
}
