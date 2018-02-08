/*
Tyler Smith
Java Per.4
Assignment = wsm3 
*/
import java.io.*;
import java.util.Scanner;
public class wsm3
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a three-digit number:");
	int num = s.nextInt();
	int first = num / 100;
	int second = (num % 100) / 10;
	int third = (num % 100) % 10;
	System.out.println("The first digit is " + first);
	System.out.println("The second digit is " + second);
	System.out.println("The third digit is " + third);
	}
}
