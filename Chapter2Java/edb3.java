/*
Tyler Smith
Java Per.4
Assignment = edb3 
*/
import java.io.*;
import java.util.Scanner;
public class edb3
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("Guess the weight in pounds");
	int lbs = s.nextInt();
	int ounces = lbs * 16;
	System.out.println("The weight in ounces is " + ounces);
	}
}
