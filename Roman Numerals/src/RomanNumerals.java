import javax.swing.JOptionPane;

public class RomanNumeral {
	
	public static void main(String[]args) {
		String[] RomanNumeral1 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] RomanNumeral10 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] RomanNumeral100  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		int yearInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		System.out.println(yearInput);
		
		int millenia = yearInput/1000%10;
		int centuries = yearInput/100%10;
		int decades = yearInput/10%10;
		int years = yearInput%10;
		
		System.out.println(millenia + " " + centuries + " " + decades + " " + years);
		String RomanNumeralYear = "M".repeat(millenia)+RomanNumeral100[centuries]+RomanNumeral10[decades]+RomanNumeral1[years];
		System.out.println(RomanNumeralYear);
		JOptionPane.showMessageDialog(null, "The roman numerals for the year " + yearInput + " is " + RomanNumeralYear);
	}

}

