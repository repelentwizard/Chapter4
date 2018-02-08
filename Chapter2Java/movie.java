/*
Tyler Smith
Java Per.4
Assignment = movie 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class movie
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("How much is Lord?");
	double lprice = s.nextDouble();
	System.out.println("How many Lords does the store own?");
	double lcount = s.nextDouble();
	System.out.println("How much is Menace?");
	double mprice = s.nextDouble();
	System.out.println("How many Menaces does the store own?");
	double mcount = s.nextDouble();
	System.out.println("How much is Kids?");
	double kprice = s.nextDouble();
	System.out.println("How many Kids does the store own");
	double kcount = s.nextDouble();
	System.out.println("Video Title\t\t\tCost\t\t\t# in stock");
	System.out.println("Lord of the Ringdings\t\t$" + lprice + "\t\t\t\t" + lcount);
	System.out.println("Menace\t\t\t\t$" + mprice + "\t\t\t\t" + mcount);
	System.out.println("Kids\t\t\t\t$" + kprice + "\t\t\t\t" + kcount);
	double total = (lprice * lcount) + (mprice * mcount) + (kprice * kcount);
	double avr = total / (lcount + mcount + kcount);
	DecimalFormat ftotal = new DecimalFormat("0000.00");
	DecimalFormat favr = new DecimalFormat("00.00");
	System.out.println("The total value of all the tapes is: $" + ftotal.format(total));
	System.out.println("The average value is: $" + favr.format(avr));
	}
}
