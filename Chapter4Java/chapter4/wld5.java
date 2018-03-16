/*
Tyler Smith
Java Per. 4
Assignment = wld5
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class wld5
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int count = 0;
	System.out.println("What is the grade");
	int grade = s.nextInt();
	while (grade != -1) 
	{
	     Scanner t = new Scanner(System.in);
	     count++;
	     System.out.println("Grade # "  + count  + " is " +  grade);
	     System.out.println("Please enter grade ( enter -1 to quit) ");
	      grade = t.nextInt();	
	}
	}
}
