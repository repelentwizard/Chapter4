/*
Tyler Smith
Java Per.4
Assignment = edb2 
*/
import java.io.*;
import java.util.Scanner;
public class edb2
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("What is your height in inches?");
	int Inches = s.nextInt();
	int Feet = Inches / 12;
	int inches = Inches % 12;
	System.out.println("You are " + Feet + "'" +  inches + "\""); 
	}
}
