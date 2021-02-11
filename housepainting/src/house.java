import java.util.Scanner;
public class house {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int length = 0;
		int width = 0;
		int height = 0;
		int numwin = 0;
		int lenwin = 0;
		int heightwin = 0;
		int doornum = 0;
		int lendoor = 0;
		int widthdoor = 0;
		
		double SqFtCost = 0;
		double paintCost = 0;
		double windoor = 0;
		double paintsurface = 0;
		double peakwall = 0;
		double wall= 0;
		double area= 0;
	
		
		System.out.println("Enter cost per square foot: ");
		SqFtCost = in.nextInt();
		
		System.out.println("Enter the lenth of the house: ");
		length = in.nextInt();
		
		System.out.println("Enter the width of the house: ");
		width = in.nextInt();
		
		System.out.println("Enter the height of the house: ");
		height = in.nextInt();
		
		System.out.println("Enter the number of windows: ");
		numwin = in.nextInt();
		
		System.out.println("Enter the length of the windows: ");
		lenwin = in.nextInt();
		
		System.out.println("Enter the width of the windows: ");
		heightwin = in.nextInt();
		
		System.out.println("Enter the amount of doors: ");
		doornum = in.nextInt();
	
		System.out.println("Enter the length of the door: ");
		lendoor = in.nextInt();
		
		System.out.println("Enter the width of the door: ");
		widthdoor = in.nextInt();
		 
		windoor = (numwin * (lenwin * heightwin)) + (doornum * (lendoor * widthdoor));
		//windoor will be subtracted with the total sq ft 
		
		//wall with peak & regular wall
		peakwall = (width * length + (length *(height - width))/2) * 2;
		wall = (width * length) * 2;
		
		//total area
		area = peakwall + wall;
		
		//paintable surface
		paintsurface = area - windoor;
		System.out.println("Your total paintable surface is " + paintsurface + " square feet");
		
		//Total cost to paint
		paintCost = paintsurface * SqFtCost; 
		System.out.println("The cost to paint the house is: " + paintCost + "dollars");
		

		
		
	}

}
