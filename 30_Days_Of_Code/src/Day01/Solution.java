package Day01;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) 
	{
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
		int i2;
		double d2;
		String s2;
		
		/* Read and save an integer, double, and String to your variables.*/
		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		
		scan.nextLine();
		s2 = scan.nextLine();
		
		/* Print the sum of both integer variables on a line. */
		System.out.println(i + i2);
		
		/* Print the sum of the double variables on a line. */
		System.out.println(d + d2);
		
		/* Concatenate and print the string variables on a line line;
		 the 's' variable above should be printed first. */
		System.out.println(s.concat(s2));
		
		scan.close();
		
	}

}
