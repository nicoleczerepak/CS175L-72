package randomnum;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int largestnum = 0;
		int smallestnum = 30;
		
		Random generator = new Random();
		
		int[] array = new int[50];
		
		for(int i = 0; i <= array.length-1; i++)
		{
			array[i] = 1 + generator.nextInt(25);
			System.out.print(array[i]+ " ");
			if(array[i]> largestnum)
			{
				largestnum = array[i];
			}
			if(array[i]< smallestnum)
			{
				smallestnum = array[i];
			}
		}
		
		
		
		System.out.println("\nLargest: " + largestnum);
		System.out.println("Smallest: " + smallestnum);
	}
}
			