/*
Tyler Smith
Java Per. 4
Assignment = test2
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class test2
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("How many coin flips are being done?");
	double flips = s.nextInt();
	int count = 1;
	double head = 0;
	double tail = 0;
	while(count <= flips)
	{
	        Scanner t = new Scanner(System.in);
		System.out.println("Was the flip heads or tails");
		char r = t.next().charAt(0);
		System.out.println("Flip coin and result(H or T)#" + count + ": " + r);
		count++;
		if(r == 'h')
		{
			head++;
		}
		else if(r == 't')
		{
			tail++;
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
		}
		System.out.println("The number of heads " + head);
		System.out.println("The number of tails " + tail);
		double hper = ((head) / (flips)) * 100;
	        double tper = ((tail) / (flips)) * 100; 
		System.out.print("The percent was " + hper + "%");
		System.out.println("The percent was " + tper + "%");
	}}
