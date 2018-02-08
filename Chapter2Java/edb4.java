/*
Tyler Smith
Java Per.4
Assignment = edb4
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class edb4
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("How many miles do you drives back and forth each day?");
	double miles = s.nextInt();
	double daily = miles * 2;
	double weekly = daily * 5;
	System.out.println("How many gallons of gas are purchased every 5-day week?");
	double gas = s.nextInt();
	double mpg = weekly / gas;
	DecimalFormat fmpg = new DecimalFormat ("0.000");
	System.out.println("Your weekly mpg is " + fmpg.format(mpg));
	}
}
