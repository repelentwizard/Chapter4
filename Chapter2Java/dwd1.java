/*
Tyler Smith
Java Per.4
Assignment = dwd1 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class dwd1
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	double cost = 12.98;
	System.out.println("How many poles do you need?");
	int poles = s.nextInt();
	double volume = 3.14 * (1.5 * 1.5) * 5; //1.5 = radius as 3ft is diameter 1.5 sqaured = 2.25
	double con = volume * poles;
	double yds = con /3;
	double price = yds * cost;
	DecimalFormat fprice = new DecimalFormat("0000.00");
	System.out.println("You need " + poles + " poles");
	System.out.println(poles + " poles will cost you $" + fprice.format(price));
	}
}
