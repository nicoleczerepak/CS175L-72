
public class ba 
{
	   private double balance;
	   
	   private double interestPct;
	  
	   
	  
	  /**
	      Constructs a bank account with zero balance.
	   */
	   public ba(double amount)
	   public ba(double amount, double intpct)
	   {
	      balance = amount;
	      interestPct = intpct;
	      System.out.println( "  Created new account with " + amount + " and interest rate" + interestPct );
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   public void deposit(double amount)
	   {
	      balance = balance + amount;
	      System.out.println("  Deposited:  " + amount);
	      
	   }
	  
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   public double getBalance()
	   {
		   return balance;
	   }
	   public void calcInterest() {
		   double  interst = balance * interestPct;
		   balance = balance + interst;
		   System.out.println("   Interest: " + interst);
		   
	   }

/**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw(double amount)
	   {
	      balance = balance - amount;
	      if (amount > balance) {
	    	  System.out.println("Insufficient funds, please try again. ");
	      }
	      else {
	    	  balance = balance - amount;
	    	  System.out.println(" Withdrew: " + amount);
	     
	      }
	      
	   }
	}
