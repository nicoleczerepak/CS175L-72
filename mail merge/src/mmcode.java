import java.util.Scanner;

public class mmcode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// mailmerge
		String rtext1 = "Dear <firstName> <lastName>, ";
		String rtext2 = "Please confrim that your adress is <houseNumber> <street>. ";
		String rtext3 = "Your answer is: <yORn> Goodbye! ";
		String ptext1 = "Please enter your first name: ";
		String ptext2 = "Please enter your last name: ";
		String ptext3 = "Please enter your house number: ";
		String ptext4 = "Please enter your street: ";
		String ptext5 = "Is this address correct? ";
		
		//first name
		System.out.println();
		System.out.print(ptext1);
		String firstName = in.nextLine();
		
		//last name
		System.out.print(ptext2);
		String lastName = in.nextLine();
		
		//House number
		System.out.print(ptext3);
		String houseNumber = in.nextLine();
		
		//street 
		System.out.print(ptext4);
		String street = in.nextLine();
		System.out.println();
		
		//mail with value
		rtext1 = rtext1.replace("<firstName>", firstName).replace("<lastName>", lastName );
		System.out.println(rtext1);
		rtext2 =  rtext2.replace("<houseNumber>", houseNumber).replace("<street>", street );
		System.out.println(rtext2);
		
		//?
		System.out.println();
		System.out.print(ptext5);
		String yn = in.nextLine();
		
		
		//answer
		rtext3 = rtext3.replace("<yORn>", yn);
		System.out.print(rtext3);
		
		in.close();
		
	}

}
