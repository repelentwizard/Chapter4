/*
Tyler Smith
Java Per.4
Assignment = dwd2 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class dwd2
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("What is the value of m and n (press enter after each) when m > n");
	int m = s.nextInt();
	int n = s.nextInt();
	int sone = (m * m) - (n * n);
	int stwo = (2 * m) * n;
	int hyp = (m * m) + (n * n);
	System.out.println("The triple is " + sone +" " + stwo + " " + hyp);
	double cost = (2.412 * sone) + (3.767 * stwo) + (15.758 * hyp);
	DecimalFormat fcost = new DecimalFormat("000.00");
	System.out.println("The cost is $" + fcost.format(cost));
	}
}
