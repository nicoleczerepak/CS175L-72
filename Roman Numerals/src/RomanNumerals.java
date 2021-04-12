import java.util.Scanner;
public class RomanNumerals {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String A = " ";
		String B = " ";
		String C = " ";
		String D = " ";
		
		int x = 0;
		
		System.out.println("Enter a number to be converted to Roman Numeral: ");
		x = in.nextInt();
		

			
		if(x==1) {
		}
			A = "I";
		
		if (x==2) {
			A = "II";
		}
		if (x==3) {
			A = "III";
		}
		if (x==4) {
			A = "IV";
		}
		if (x==5) {
			A = "V";
		}
		if (x==6) {
			A = "VI";
		}
		if (x==7) {
			A = "VII";
		}
		if (x==8) {
			A = "VIII";
		}
		if (x==9) {
			A = "IX";
		}

	if(x >= 10) {
		if (x < 20) {
			B = "X";
			
		}
	}
		if (x >= 20) {
			if (x < 30) {
				B = "XX";
				
			}
		}
		if(x >= 30) {
			if (x < 40) {
				B = "XXX";
				
			}
		}
		if(x >= 40) {
			if (x < 50) {
				B = "XL";
				
			}
		}
		if(x >= 50) {
			if (x < 60) {
				B = "L";
				
			}
		}
		if(x >= 60) {
			if (x < 70) {
				B = "LX";
				
			}
		}
		if(x >= 70) {
			if (x < 80) {
				B = "LXX";
				
			}
		}
		if(x >= 80) {
			if (x < 90) {
				B = "LXXX";
				
			}
		}
		if(x >= 90) {
			if (x < 100) {
				B = "XC";
				
			}
		}
		if(x >= 100) {
			if(x < 200) {
				C = "C";
				x = x - 100;
			}
		}
		if(x >= 200) {
			if(x < 300) {
				C = "CC";
				x = x - 200;
			}
		}
		if(x >= 300) {
			if(x < 400) {
				C = "CCC";
				
			}
		}	
		if(x >= 400) {
			if(x < 500) {
				C = "CD";
				
			}
		}	
		if(x >= 500) {
			if(x<600) {
				C = "D";
				
			}
		}
		if(x >= 600) {
			if(x < 700) {
				C = "DC";
				
			}
		}
		if(x >= 700) {
			if(x < 800) {
				C = "DCC";
				
			}
		}
		if(x >= 800) {
			if(x < 900) {
				C = "DCCC";
				
			}
		}
		if (x >= 900) {
			if(x < 1000) {
				C = "CM";
				
			}
		}
		if(x >= 1000) {
			if ( x < 2000) {
			D = "M";
			
			}
		}
		if(x >= 2000) {
			if(x < 3000) {
			D = "MM";
			
			}
		}
		if(x >= 3000) {
			if(x < 4000) {
			D = "MMM";
			
			}
		}
		System.out.println(D + C + B + A);
		
	}
}

	
	
		