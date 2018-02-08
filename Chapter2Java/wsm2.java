/*
Tyler Smith
Java Per.4
Assignment = wsm2 
*/
import java.io.*;
import java.util.Scanner;
public class wsm2
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a two-digit number:");
	int num = s.nextInt();
	int first = num / 10;
	int second = num % 10;
	System.out.println("The first digit is " + first);
	System.out.println("The second digit is " + second);
	}
}
