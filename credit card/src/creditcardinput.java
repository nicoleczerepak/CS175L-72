import java.util.Scanner;
public class creditcardinput {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String creditcard = null;
        System.out.println("Please enter the credit card number or -99 to end:");
        
        
        while(creditcard.equals("-99")){
              System.out.print("Goodbye");
            
                 }
            
        int i = 0;
        
        while (i < creditcard.length())
        {
            char cc = creditcard.charAt(i);

            if (cc == ' ' || cc == '-') 
            {
                String before = creditcard.substring(0,i);
                String after = creditcard.substring(i+1);
                creditcard= before + after;

            }
            else 
            {
                i++;
                
                System.out.println(creditcard);

                }
            }

        }
    }
   