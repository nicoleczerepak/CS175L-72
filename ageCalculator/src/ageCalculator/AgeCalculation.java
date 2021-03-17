package ageCalculator;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;



public class AgeCalculation {

	public static void main(String[] args) {
	
		String one = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY)");
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String today = sdf.format(new Date());
		
		String tmonth = today.substring(0, 2);
		String tday = today.substring(3, 5);
		String tyear = today.substring(6, 10);
		
		String month = one.substring(0, 2);
		String day = one.substring(3, 5);
		String year = one.substring(6, 10);
		
		int months = Integer.parseInt(month);
		int days = Integer.parseInt(day);
		int years = Integer.parseInt(year);
		
		int months = Integer.parseInt(tmonth);
		int daypresent = Integer.parseInt(tday);
		int dayyears = Integer.parseInt(tyear);
		
		
		months = daypresent - months;
		int agewithdays = daypresent - days;



		if(years/4 > 0)
		{
			if(months >= 3)
			{
				agewithdays++;
			}
		}
		years = daypresent - years;
		
		
		System.out.println(months + "/" + agewithdays + "/" + years);
		}



}
