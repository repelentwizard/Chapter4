/*
Tyler Smith
Java Per.4
Assignment = piggy
*/
import java.io.*;
import java.util.Scanner;
public class piggy
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter your name");
	String name = s.nextLine();
	System.out.println("Please type how many pennies are in your piggy bank.");
	int penny = s.nextInt();
	System.out.println("Please type how many nichels are in your piggy bank.");
        int nickel = s.nextInt();
	System.out.println("Please type how many dimes are in your piggy bank.");
        int dime = s.nextInt();
	System.out.println("Please type how many quarters are in your piggy bank.");
        int quarter = s.nextInt();
	System.out.println("Please type how many weeks you have been saving for.");
        int weeks = s.nextInt();
	double ptotal = penny 
	System.out.println("Type of Coin\t\t" + "Amount of Coins\t\t" + "Total");
	System.out.println("Pennis\t\t" + penny + "\t\t" + ptotal);

	}
}
