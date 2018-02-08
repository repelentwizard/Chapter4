/*
Tyler Smith
Java Per.4
Assignment = test
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class test2
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	String k = "Freddy Kruger";
	String f = "Frenk N. Stein";
	System.out.println("How many sighting of " + k + " and " + f + " have there been? (seperated by enter)");
	int knum = s.nextInt();
	int fnum = s.nextInt();
	System.out.println(k + " has been sighted " + knum);
	System.out.println(f + " has been sighted " + fnum);
	int numtot = fnum + knum;
	System.out.println("This is a total of " + numtot + " of sightings! YEEK!");
	double cashtot = numtot * 5.95;
	DecimalFormat fcashtot = new DecimalFormat("000.00");
	System.out.println("The total rewards for ghoul sightings is $" + fcashtot.format(cashtot) + ".");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Happy Halloween!!");
	}
}
